/*!
 * Client Oberflaeche für den Zugriff auf Datensaetze von INSPIRE Download Feeds
 *
 * Verwendet das JQuery Plugin "dataTables"
 *
 * Autoren: Mathias Luecker, Michael Raeder
 * MDI-DE - Marine Dateninfrastruktur Deutschland
 * http://www.mdi-de.org
 *
 * Datum: 14.06.2013
 */

$(function () {
    $.ajax({
    	  type: 'GET',
    	  /*
    	   * Hier URL anpassen, wenn ein anderer Application Name verwendet wird.
    	   */
    	  url: '/atomFeed/Client?request=getServices',
    	  success: onDataReceived,
    	  dataType: 'json',
    	  error: function (xhr, ajaxOptions, thrownError){
    	        alert(xhr.statusText);
    	        alert(thrownError);} 
    });
    
    function onDataReceived(services){
    	for(var i = 0; i<services.services.length; i++){
    		$("#select_service").append("<option value=\""+services.services[i].uuid+"\" >"+services.services[i].title+"</option>");
    		$('head').append('<link rel="search" href="/atomFeed/getFeedDoc?type=OpenSearch&uuid='+services.services[i].uuid+'" type="application/opensearchdescription+xml" title="'+services.services[i].title+'" />');

      	  /*
      	   * Hier URL anpassen, wenn eine andere Ordnerstruktur verwendet wird.
      	   */
    		$("#feed-list").append("<li><a target=\"_blank\" href=\"getFeedDoc?type=Service&uuid="+services.services[i].uuid+"\">"+services.services[i].title+"</a></li>");
    	}
    }
		
	function fnFormatDetails ( oTable, nTr )
	{
		var aData = oTable.fnGetData( nTr );
		var sOut = '<table cellpadding="5" cellspacing="0" border="0" style="padding-left:50px;font-size:1em;">';
		sOut += '<tr><td>Downloadlink:</td><td><a href="'+aData.link+'">'+aData.link+'</a></td></tr>';
		sOut += '<tr><td>Rechte:</td><td>'+aData.rights+'</td></tr>';
		sOut += '<tr><td><img style="max-height: 200px; max-width: 300px; border: 1px solid black;" src="'+aData.browseGraphic+'" alt=\"Vorschaugrafik\" /></td><td><div style="height: 200px; width: 500px; border: 1px solid black;" id="map_'+aData.uuid+'_'+aData.epsg+'_'+aData.type+'"></div></td></tr>';
		sOut += '</table>';
		return sOut;
	}
	
	function createMapElement ( uuid, bbox )
	{
	       /*
      	   * Styling der BBOX
      	   */
		
		  var featureLayer = new OpenLayers.Layer.Vector('featureLayer', {
		        styleMap: new OpenLayers.StyleMap({"default": new OpenLayers.Style({
		        		'pointRadius'   	: 3,
		                'fillColor'     	: "#ff0000",
		                'fillOpacity'   	: 0.3,
		                'strokeColor'   	: "#000000",
		                'strokeWidth'   	: 2,
		                'strokeDashstyle'	: "dashdot",
						'strokeOpacity' 	: 1,
		                'graphicZIndex' 	: 1,		
						'label'				: "Ausdehnung (Bbox) des Datensatzes",
						//'label'				: "${labeltext}",
						'labelAlign'		: "cc",
						'fontColor'			: "#333333",
						'fontOpacity'		: 0.9,
						'fontFamily'		: "Arial",
						'fontSize'			: 16,
						'fontWeight'		: "800"
		            })})
		  });
		var point = bbox.split(" ");  
		var sitePoints = [];
		var point1 = new OpenLayers.Geometry.Point(point[1], point[0]).transform(new OpenLayers.Projection("EPSG:4326"),new OpenLayers.Projection("EPSG:25832"));
		var point2 = new OpenLayers.Geometry.Point(point[1], point[2]).transform(new OpenLayers.Projection("EPSG:4326"),new OpenLayers.Projection("EPSG:25832"));
		var point3 = new OpenLayers.Geometry.Point(point[3], point[2]).transform(new OpenLayers.Projection("EPSG:4326"),new OpenLayers.Projection("EPSG:25832"));
		var point4 = new OpenLayers.Geometry.Point(point[3], point[0]).transform(new OpenLayers.Projection("EPSG:4326"),new OpenLayers.Projection("EPSG:25832"));
		sitePoints.push(point1);
		sitePoints.push(point2);
		sitePoints.push(point3);
		sitePoints.push(point4);
		var linearRing = new OpenLayers.Geometry.LinearRing(sitePoints);
		var polygonFeature = new OpenLayers.Feature.Vector(linearRing, {
			id: uuid
		});
		featureLayer.addFeatures([polygonFeature]);
		
		/*
      	 * Lizenz für den Webaltlas.de
      	 */
		var currentYear = (new Date).getFullYear();				
		var liz_bkg		= '<a href="http://www.bkg.bund.de" target="blank">&copy; GeoBasis-DE / BKG '+currentYear+'</a>';
		
		//Proj4js.defs["EPSG:25832"] = "+proj=utm +zone=32 +ellps=GRS80 +units=m +no_defs";
		
	    var map = new OpenLayers.Map({
	          layers: [
						new OpenLayers.Layer.WMS( "OpenLayers WMS",
							 "http://sg.geodatenzentrum.de/wms_webatlasde.light?", 
							 {layers: 'webatlasde.light',format: "image/png", transparent: true},
							 {isBaseLayer: true, visibility: true, noLegend: true, transitionEffect: 'resize', alpha: true, attribution: liz_bkg}
												),
						featureLayer
					  ],
			projection: new OpenLayers.Projection('EPSG:25832'),
			displayProjection: new OpenLayers.Projection("EPSG:25832"),
			maxResolution: 881.9438,
			units: 'm',
			numZoomLevels: 12,
			zoom: 1,
			maxExtent: new OpenLayers.Bounds(198055.964604,5047963.58343,1398535.18562,6359780.49079)
	        });

	      map.render('map_'+uuid);
	      map.zoomToExtent(featureLayer.getDataExtent()); 
	}
			  
    var oTable = $('#datasets').dataTable( {
        "bProcessing": true,
  	  	/*
  	  	 * Hier URL anpassen, wenn ein anderer Application Name verwendet wird.
  	  	 */
        "sAjaxSource": "/atomFeed/Client?request=getTableData&serviceId=",
        "sAjaxDataProp" : "aaData",
        "oLanguage" : {
			"sSearch" : "Volltextsuche:",
			"sInfo" : "Zeige _START_ bis _END_ von _TOTAL_ Eintr\u00e4gen",
			"sLengthMenu" : "Zeige _MENU_ Eintr\u00e4ge",
			"oPaginate" : {
				"sFirst" : "Erste",
				"sLast" : "Letzte",
				"sNext" : "N\u00e4chste",
				"sPrevious" : "Vorige"
			}
		},
        "aoColumns": [
            { "mData": "detailImage"},
            { "mData": "title" },
			{ "mData": "epsg" },
			{ "mData": "type" },
			{ "mData": "organisation" },
            { "mData": "uuid" }
        ]
    } );
    
	$(document).on('click', '#showDetail',function () {
		var nTr = $(this).parents('tr')[0];
		if ( oTable.fnIsOpen(nTr) )
		{   
			/*
	    	* Hier URL anpassen, wenn ein anderer Application Name verwendet wird.
	    	*/
			this.src = "/atomFeed/images/details_open.png";
			oTable.fnClose( nTr );
		}
		else
		{
			/*
	    	* Hier URL anpassen, wenn ein anderer Application Name verwendet wird.
	    	*/
			this.src = "/atomFeed/images/details_close.png";
			oTable.fnOpen( nTr, fnFormatDetails(oTable, nTr), 'details' );
			createMapElement( oTable.fnGetData( nTr ).uuid+"_"+oTable.fnGetData( nTr ).epsg+"_"+oTable.fnGetData( nTr ).type, oTable.fnGetData( nTr ).bbox );
		}
	} );
	$('#select_service').on('change', function (e) {
		if(this.value != "999999"){
			/*
	    	* Hier URL anpassen, wenn ein anderer Application Name verwendet wird.
	    	*/
	    	oTable.fnReloadAjax( '/atomFeed/Client?request=getTableData&serviceId='+this.value );
		}
	});
});