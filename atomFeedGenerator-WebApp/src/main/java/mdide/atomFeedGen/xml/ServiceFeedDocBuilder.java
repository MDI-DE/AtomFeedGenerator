package mdide.atomFeedGen.xml;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.namespace.QName;

import mdide.atomFeedGen.exception.InvalidCoupledRessourceException;
import mdide.atomFeedGen.utils.DatasetElements;
import mdide.atomFeedGen.utils.ServiceElements;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlCursor;
import org.w3.x2005.atom.CategoryType;
import org.w3.x2005.atom.DateTimeType;
import org.w3.x2005.atom.EntryType;
import org.w3.x2005.atom.FeedDocument;
import org.w3.x2005.atom.FeedType;
import org.w3.x2005.atom.IdType;
import org.w3.x2005.atom.LinkType;
import org.w3.x2005.atom.LogoType;
import org.w3.x2005.atom.PersonType;
import org.w3.x2005.atom.TextType;

/**
 * Erzeugt ein Service-AtomFeed XML
 * 
 * @author Mathias Luecker
 *
 */
public class ServiceFeedDocBuilder extends AbstractAtomFeedDocBuilder{
	static Logger log = Logger.getLogger(ServiceFeedDocBuilder.class);
	/**
	 * Erzeugt ein Service-AtomFeed XML als String
	 * 
	 * @param serviceElements
	 * @param dataSetList
	 * @param params
	 * @return
	 * @throws InvalidCoupledRessourceException
	 * @throws UnsupportedEncodingException 
	 */
	public static String encode(ServiceElements serviceElements, List<DatasetElements> dataSetList, HashMap<String, String> params) throws InvalidCoupledRessourceException, UnsupportedEncodingException{
	
		log.info("step 1");
		FeedDocument feedDoc = FeedDocument.Factory.newInstance();
		log.info("step 2");
		FeedType feed = feedDoc.addNewFeed();
		log.info("step 3");
		XmlCursor cursor= feed.newCursor();
		log.info("step 4");
		cursor.toNextToken();
		log.info("step 5");
		cursor.insertNamespace("inspire_dls", "http://inspire.ec.europa.eu/schemas/inspire_dls/1.0");
		log.info("step 6");
		cursor.insertNamespace("georss", "http://www.georss.org/georss/10");
		log.info("step 7");
		cursor.insertAttributeWithValue("schemaLocation","http://www.w3.com/2001/XMLSchema-instance", "http://www.w3.org/2005/Atom");
		log.info("step 8");
		cursor.dispose();
		log.info("step 9");
		log.info(serviceElements.getTitle());
		
		TextType title = feed.addNewTitle();
		title.set(getXmlString("INSPIRE Download Service Feed: "+serviceElements.getTitle()));
		
		TextType subtitle = feed.addNewSubtitle();
		subtitle.set(getXmlString(serviceElements.getDesc()));
				
		LinkType[] linkArray = new LinkType[3];
		
		LinkType link1 = getLinkType(
				params.get("cswURL")+"Service=CSW&Version=2.0.2&ElementSetName=full&outputSchema=http://www.isotc211.org/2005/gmd&Id="+params.get("downloadUUID")+"&Request=GetRecordById",
				"describedby",
				"application/xml",
				"Download Service Feed Metadata",
				null,
				null,
				null,
				null
				);
		linkArray[0]=link1;
		
		LinkType link2 = getLinkType(
				params.get("feedURL")+"getFeedDoc?type=Service&uuid="+params.get("downloadUUID"),
				"self",
				"application/atom+xml",
				"INSPIRE Download Service Feed: "+serviceElements.getTitle(),
				params.get("language"),
				null,
				null,
				null
				);
		linkArray[1]=link2;
		
		LinkType link3 = getLinkType(
				params.get("feedURL")+"getFeedDoc?type=OpenSearch&uuid="+params.get("downloadUUID"),
				"search",
				"application/opensearchdescription+xml",
				"OpenSearch Description",
				params.get("language"),
				null,
				null,
				null
				);
		linkArray[2]=link3;
		
		feed.setLinkArray(linkArray);
				
		LogoType logo = feed.addNewLogo();
		logo.setStringValue(serviceElements.getBrowseGraphic());
		
		IdType id = feed.addNewId();
		id.setStringValue(params.get("feedURL")+"getFeedDoc?type=Service&uuid="+params.get("downloadUUID"));
		
		TextType rights = feed.addNewRights();
		rights.set(getXmlString(serviceElements.getRights()));
		
		DateTimeType updated = feed.addNewUpdated();
		updated.setStringValue(serviceElements.getDateStamp());
		
		PersonType author = feed.addNewAuthor();
		author.addEmail(serviceElements.getAuthorMail());
		author.addName(serviceElements.getAuthorName());

		log.info("Number of Datasets "+dataSetList.size());
		
		for(int i = 0; i < dataSetList.size();i++){

			DatasetElements temp=dataSetList.get(i);
			
			if(!temp.getType().equals("tile")){
										
				EntryType entry = feed.addNewEntry();
			    TextType entryTitle = entry.addNewTitle();
			    entryTitle.set(getXmlString("INSPIRE Dataset Feed: "+temp.getTitle()));
	
			    TextType summary = entry.addNewSummary();
			    try{
				    XmlCursor summarycur = summary.newCursor();
				    
				    if(temp.getBrowseGraphic().equals("")){
				    	summary.set(getXmlString("<div>"+temp.getDesc()+"</div>"));
				    }else{
				    	//summary.set(getXmlString("&lt;div style=\"float:left;\"&gt;&lt;img height=\"200\" src=\""+temp.getBrowseGraphic()+"\" alt=\"Vorschaugrafik\" /&gt;&lt;/div&gt;&lt;div&gt;"+temp.getZusammenfassung()+"&lt;/div&gt;"));
				    	summary.set(getXmlString("<div style=\"float:left;\"><img height=\"200\" src=\""+temp.getBrowseGraphic()+"\" alt=\"Vorschaugrafik\" /></div><div>"+temp.getDesc()+"</div>"));
				    }
				    
				    summarycur.toNextToken();
				    summarycur.insertAttributeWithValue(new QName("type"),"html");
				    summarycur.dispose();
			    }catch(Exception e){
			    	e.printStackTrace();
			    }
			    XmlCursor cur = entry.newCursor();
			    cur.toEndToken();
	
			    cur.beginElement(new QName("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0", "spatial_dataset_identifier_code"));
			    cur.insertChars(temp.getCodeUUID());
			    
			    String[] splitResult = temp.getCodeUUID().split("#");
			    
				if(splitResult.length == 0){
					throw new InvalidCoupledRessourceException();
				}
	
			    cur.toNextToken();
			    cur.beginElement(new QName("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0", "spatial_dataset_identifier_namespace"));
			    cur.insertChars(splitResult[0]);
			    		    
			    LinkType[] entrylinkArray = new LinkType[2];
				LinkType entrylink1 = getLinkType(
						params.get("cswURL")+"service=CSW&REQUEST=GetRecordById&VERSION=2.0.2&elementsetname=full&outputSchema=http://www.isotc211.org/2005/gmd&Id="+temp.getId(),
						"describedby",
						"application/xml",
						"INSPIRE Dataset Feed: "+temp.getTitle(),
						null,
						null,
						null,
						null
						);
				entrylinkArray[0]=entrylink1;
				
				LinkType entrylink2 = getLinkType(
						params.get("feedURL")+"getFeedDoc?type=DataSet&uuid="+temp.getId(),
						"alternate",
						"application/atom+xml",
						"INSPIRE Dataset Feed: "+temp.getTitle(),
						null,
						null,
						null,
						null
						);
				entrylinkArray[1]=entrylink2;
				
				entry.setLinkArray(entrylinkArray);
				
				IdType entryId = entry.addNewId();
			    entryId.setStringValue(params.get("feedURL")+"getFeedDoc?type=DataSet&uuid="+temp.getId());
				
			    TextType entryRights = entry.addNewRights();
			    entryRights.set(getXmlString(temp.getRights()));
			    
				DateTimeType entryUpdated = entry.addNewUpdated();
				entryUpdated.setStringValue(temp.getDateStamp());
				
				PersonType entryAuthor = entry.addNewAuthor();
				entryAuthor.addEmail(temp.getAuthorMail());
				entryAuthor.addName(temp.getAuthorName());
	
				cur.toNextToken();
			    cur.beginElement(new QName("http://www.georss.org/georss", "box"));
			    cur.insertChars(temp.getBBOX());
			    cur.dispose();
			    
	
			    		    
				List<String> epsgCodes = new ArrayList<String>();
				for(int j = 0; j < temp.getDescriptionList().size();j++){
					
					if(params.get("transOpt").equals("old")){
						String[] descResult = temp.getDescriptionList().get(j).split("#");
						if(descResult.length == 4){
							
							String[] epsgResult = descResult[3].split(":");
	
							if(!epsgCodes.contains(epsgResult[1].trim())){
								epsgCodes.add(epsgResult[1].trim());
						    	CategoryType category = entry.addNewCategory();
						    	category.setTerm("http://www.opengis.net/def/crs/EPSG/0/"+epsgResult[1]);
						    	category.setLabel("EPSG "+epsgResult[1]);
							}
						}
					}
					
					if(params.get("transOpt").equals("new")){
						if(temp.getCodeListValueList().get(j).equals("download") && temp.getNameList().get(j).contains("predefined ATOM")){
							String[] descSplit = temp.getDescriptionList().get(j).split(" ");
							String epsgValue ="";
							for(int k = 0; k < descSplit.length; k++){
								if(descSplit[k].contains("EPSG:")){
									epsgValue=descSplit[k].substring(6,descSplit[k].length());
									break;
								}
							}
							
							if(!epsgCodes.contains(epsgValue)){
								epsgCodes.add(epsgValue);
						    	CategoryType category = entry.addNewCategory();
						    	category.setTerm("http://www.opengis.net/def/crs/EPSG/0/"+epsgValue);
						    	category.setLabel("EPSG "+epsgValue);
							}
	
						}
					}
					
				}
			}
		}

		return xmlToString(feedDoc);	
	}
	
}
