package mdide.atomFeedGen.xml;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.xml.namespace.QName;

import mdide.atomFeedGen.utils.DatasetElements;

import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;

import com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument;
import com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription;
import com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image;
import com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url;
import com.a9.spec.opensearch.x11.QueryType;

/**
 * Erzeugt ein OpenSearch XML
 * 
 * @author Mathias Luecker
 *
 */
public class OpenSearchDocBuilder {
	
	/**
	 * Erzeugt ein OpenSearch XML als String
	 * 
	 * @param dataSetList
	 * @param params
	 * @param types
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String encode(List<DatasetElements> dataSetList, HashMap<String, String> params, List<String> types) throws UnsupportedEncodingException{
		
		OpenSearchDescriptionDocument openSearchDoc = null;
		
		openSearchDoc = OpenSearchDescriptionDocument.Factory.newInstance();
		OpenSearchDescription openSearch = openSearchDoc.addNewOpenSearchDescription();
				
		XmlCursor cursor= openSearch.newCursor();
		cursor.toNextToken();
		cursor.insertNamespace("inspire_dls", "http://inspire.ec.europa.eu/schemas/inspire_dls/1.0");
		cursor.insertAttributeWithValue("schemaLocation","http://www.w3.com/2001/XMLSchema-instance", "http://a9.com/-/spec/opensearch/1.1/");
		cursor.dispose();
		
		openSearch.setDescription(params.get("desc"));

		addUrl("application/opensearchdescription+xml","self",params.get("feedURL")+"OpenSearchService?request=getOpenSearchDescriptionDocument&service_identifier_code="+params.get("downloadUUID"),openSearch);
		addUrl("application/atom+xml","results",params.get("feedURL")+"OpenSearchService?q={searchTerms}",openSearch);
		addUrl("application/atom+xml","results",params.get("feedURL")+"OpenSearchService?request=getDataSet&spatial_dataset_identifier_code={inspire_dls:spatial_dataset_identifier_code?}&spatial_dataset_identifier_namespace={inspire_dls:spatial_dataset_identifier_namespace?}&crs={inspire_dls:crs?}&language={language?}&q={searchTerms}",openSearch);
		addUrl("text/html","results",params.get("feedURL")+"OpenSearchService?q={searchTerms}",openSearch);
		addUrl("application/atom+xml","describedby",params.get("feedURL")+"OpenSearchService?request=getDatasetFeed&spatial_dataset_identifier_code={inspire_dls:spatial_dataset_identifier_code?}&spatial_dataset_identifier_namespace={inspire_dls:spatial_dataset_identifier_namespace?}&crs={inspire_dls:crs?}&language={language?}",openSearch);
		
		
		for(int j=0; j< types.size();j++){
			addUrl(types.get(j),"results",params.get("feedURL")+"OpenSearchService?request=getDataSet&spatial_dataset_identifier_code={inspire_dls:spatial_dataset_identifier_code?}&spatial_dataset_identifier_namespace={inspire_dls:spatial_dataset_identifier_namespace?}&crs={inspire_dls:crs?}&language={language?}",openSearch);
		}
		
		openSearch.setDescription(params.get("desc"));
		openSearch.setContact(params.get("authorMail"));
		openSearch.setTags(params.get("keytemp"));
		openSearch.setShortName(params.get("shortname"));
		openSearch.setLongName(params.get("longname"));
		Image image = openSearch.addNewImage();
		image.setHeight(BigInteger.valueOf(100));
		image.setWidth(BigInteger.valueOf(100));
		XmlAnySimpleType type = XmlAnySimpleType.Factory.newInstance();
		type.setStringValue(params.get("imageType"));
		image.setType(type);
		XmlString bg = XmlString.Factory.newInstance();
		bg.setStringValue(params.get("browseGraphic"));
		image.set(bg);
		
		for(int i = 0; i < dataSetList.size();i++){
			DatasetElements temp=dataSetList.get(i);
			String[] splitResult = temp.getCodeUUID().split("#");
			
			String languageDS="";
			if(temp.getLanguage().equals("ger")){
				languageDS="de";
			}
			if(temp.getLanguage().equals("eng")){
				languageDS="en";
			}
			
			for(int j = 0; j < temp.getDescriptionList().size();j++){
				if(params.get("transOpt").equals("old")){

					String[] descResult = temp.getDescriptionList().get(j).split("#");
					
					if(descResult.length == 4){
						
						String[] epsgResult = descResult[3].split(":");
						
						
						QueryType query = openSearch.addNewQuery();
						XmlAnySimpleType lang = query.addNewLanguage();
						lang.setStringValue(languageDS);
						
						String title = "";
										
						if(temp.getTitle().length() > 256){
							String[] titlesplit = temp.getTitle().split("\\s+");
							
							for(int k = 0; k < titlesplit.length; k++){
								String titletemp = title + titlesplit[k] +" ";
								if(titletemp.length() < 256){
									title = titletemp;
								}else{
									break;
								}
								
							}
							
							title = title.substring(0, title.length()-1);
							
						}else{
							title = temp.getTitle();
						}
						
						query.setTitle(title);
						query.setCount(BigInteger.valueOf(1));
						
						XmlCursor querycursor= query.newCursor();
						querycursor.toNextToken();
						querycursor.insertAttributeWithValue("role","example");
						querycursor.toNextToken();
						querycursor.insertAttributeWithValue("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0","spatial_dataset_identifier_namespace",splitResult[0]);
						querycursor.toNextToken();
						querycursor.insertAttributeWithValue("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0","spatial_dataset_identifier_code",temp.getId());
						querycursor.toNextToken();
						querycursor.insertAttributeWithValue("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0","crs","http://www.opengis.net/def/crs/EPSG/0/"+epsgResult[1].trim());

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
						
						String title = "";
						
						if(temp.getTitle().length() > 256){
							String[] titlesplit = temp.getTitle().split("\\s+");
							
							for(int k = 0; k < titlesplit.length; k++){
								String titletemp = title + titlesplit[k] +" ";
								if(titletemp.length() < 256){
									title = titletemp;
								}else{
									break;
								}
								
							}
							
							title = title.substring(0, title.length()-1);
							
						}else{
							title = temp.getTitle();
						}
						
						QueryType query = openSearch.addNewQuery();
						XmlAnySimpleType lang = query.addNewLanguage();
						lang.setStringValue(languageDS);
						query.setTitle(title);
						query.setCount(BigInteger.valueOf(1));
						
						XmlCursor querycursor= query.newCursor();
						querycursor.toNextToken();
						querycursor.insertAttributeWithValue("role","example");
						querycursor.toNextToken();
						querycursor.insertAttributeWithValue(new QName("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0", "spatial_dataset_identifier_namespace"),splitResult[0]);
						//querycursor.toNextToken();
						querycursor.insertAttributeWithValue(new QName("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0", "spatial_dataset_identifier_code"),temp.getId());
						//querycursor.toNextToken();
						querycursor.insertAttributeWithValue(new QName("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0", "crs"),"http://www.opengis.net/def/crs/EPSG/0/"+epsgValue);
					}
				}					
			}				
		}		
		
		openSearch.setDeveloper(params.get("orgName"));
		openSearch.setLanguage(params.get("language"));
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			openSearchDoc.save(baos, getXmlOptions());
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return baos.toString("UTF-8");
		
	}
	
	/**
	 *  Stellt allgeimeine Einstellungen zur Formatierung und XML-Erzeugung bereit.
	 * 
	 * @return
	 */
	private static XmlOptions getXmlOptions(){
		XmlOptions xmlOptions = new XmlOptions();
		xmlOptions.setSavePrettyPrint();
		xmlOptions.setSavePrettyPrintIndent(3);
		xmlOptions.setCharacterEncoding("UTF-8");
		xmlOptions.setUseDefaultNamespace();
		
		return xmlOptions;	
	}

	/**
	 * Erezugt ein neues URL-Element im OpenSearch XML
	 * 
	 * @param typeStr
	 * @param relStr
	 * @param templateStr
	 * @param openSearch
	 */
	private static void addUrl(String typeStr, String relStr, String templateStr, OpenSearchDescription openSearch){
		Url url = openSearch.addNewUrl();
		XmlAnySimpleType type = url.addNewType();
		type.setStringValue(typeStr);
		XmlAnySimpleType rel = url.addNewRel();
		rel.setStringValue(relStr);
		XmlAnySimpleType template = url.addNewTemplate();
		template.setStringValue(templateStr);
	}
	
}
