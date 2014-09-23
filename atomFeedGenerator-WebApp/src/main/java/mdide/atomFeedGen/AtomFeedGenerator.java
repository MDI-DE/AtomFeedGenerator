package mdide.atomFeedGen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;

import mdide.atomFeedGen.exception.InvalidCoupledRessourceException;
import mdide.atomFeedGen.utils.CSWUtil;
import mdide.atomFeedGen.utils.DatasetElements;
import mdide.atomFeedGen.utils.FeedWriter;
import mdide.atomFeedGen.utils.ServiceElements;
import mdide.atomFeedGen.xml.DatasetFeedDocBuilder;
import mdide.atomFeedGen.xml.DatasetXPaths;
import mdide.atomFeedGen.xml.Namespaces;
import mdide.atomFeedGen.xml.OpenSearchDocBuilder;
import mdide.atomFeedGen.xml.ServiceFeedDocBuilder;
import mdide.atomFeedGen.xml.ServiceXPaths;
import mdide.model.JPAManager;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.apache.log4j.Logger;

/**
* Managet das Abrufen der Metadaten, das Parsen der Elemente sowie die <br />
* Generierung der AtomFeed- und OpenSearch-Dokumente <br />
* Implementiert Quartz.Job
*
* @author Mathias Luecker, Michael Raeder
*/
public class AtomFeedGenerator implements Job{
	
	private String proxyHost;
	private int proxyPort;
	private String cswURL;
	private String dataSetPath,servicePath,feedURL,opensearchPath,downloadUUIDs,transOpt;
	private ServletContext servletContext;
	static Logger log = Logger.getLogger(AtomFeedGenerator.class);
	
	/**
	 * Hauptmethode, die den Prozess startet.
	 * 
	 */
	public void execute(JobExecutionContext context) throws JobExecutionException {
		this.servletContext=(ServletContext)context.getMergedJobDataMap().get("servletContext");	
		loadProperties();		
		log.info("-------------------------------------------------------------------");
		log.info("Starting to generate Atom Feed files.");
		
		if(cswURL == null && feedURL == null && servicePath==null && dataSetPath==null && opensearchPath == null){
			log.error("Config.properties parameter missing.");
		}
		
		String[] downloadIDs = downloadUUIDs.split(",");

		for(int id=0; id < downloadIDs.length; id ++){
			String downloadUUID = downloadIDs[id];
			
			try{
						
				String resp = CSWUtil.executeRequest(cswURL, downloadUUID, proxyHost, proxyPort);
				
				if (!resp.contains("Exception")) {
					parseMetadata(resp,downloadUUID);
	
				}else{
					log.error("Service UUID can not be found!");
				}
			}catch(DocumentException de){
				log.error(de.toString(), de.fillInStackTrace());
			   	System.out.println(de.toString());
			}				
		}
	}
	
	/**
	 * Hier wird das Metadaten XML geparset.
	 * 
	 * @param resp
	 * @param downloadUUID
	 * @throws DocumentException
	 */
	@SuppressWarnings("unchecked")
	private void parseMetadata(String resp, String downloadUUID) throws DocumentException{
		SAXReader reader = new SAXReader();
		reader.setStripWhitespaceText(true);
		reader.setMergeAdjacentText(true);
		Document document = reader.read(new StringReader(resp));
		
		Map<String, String> namespaceURIs=null;
		try {
			namespaceURIs = Namespaces.getNamespaces(resp);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
		log.info("Parsing Metadata");
		
		ServiceElements serviceElements = new ServiceElements();
		List<DatasetElements> dataSetList=new ArrayList<DatasetElements>();

		serviceElements.setTitle(getElement(ServiceXPaths.getXPath(ServiceXPaths.TITEL,namespaceURIs), namespaceURIs, document));
		serviceElements.setDesc(getElement(ServiceXPaths.getXPath(ServiceXPaths.DESC,namespaceURIs), namespaceURIs, document));
		serviceElements.setDateStamp(getElement(ServiceXPaths.getXPath(ServiceXPaths.DATE_STAMP,namespaceURIs), namespaceURIs, document));
		serviceElements.setRights(getElement(ServiceXPaths.getXPath(ServiceXPaths.RIGHTS,namespaceURIs), namespaceURIs, document));
		serviceElements.setLanguage(getElement(ServiceXPaths.getXPath(ServiceXPaths.LANGUAGE,namespaceURIs), namespaceURIs, document));
		serviceElements.setAuthorName(getElement(ServiceXPaths.getXPath(ServiceXPaths.AUTHOR_NAME,namespaceURIs), namespaceURIs, document));
		serviceElements.setAuthorMail(getElement(ServiceXPaths.getXPath(ServiceXPaths.AUTHOR_MAIL,namespaceURIs), namespaceURIs, document));
		serviceElements.setOrgName(getElement(ServiceXPaths.getXPath(ServiceXPaths.ORG_NAME,namespaceURIs), namespaceURIs, document));
		serviceElements.setBrowseGraphic(getElement(ServiceXPaths.getXPath(ServiceXPaths.BROWSE_GRAPHIC,namespaceURIs), namespaceURIs, document));

		  XPath xPathKW = DocumentHelper.createXPath(ServiceXPaths.getXPath(ServiceXPaths.KEYWORDS,namespaceURIs));
		  xPathKW.setNamespaceURIs(namespaceURIs);
		  List<Node> asResultsNodesKW = xPathKW.selectNodes(document.getRootElement());
		  List<String> keywords =new ArrayList<String>();
		  for(int j=0;j<asResultsNodesKW.size();j++){
			  keywords.add(asResultsNodesKW.get(j).getStringValue().replace("&", "&amp;"));
		  }
		  serviceElements.setKeywords(keywords);	
		  
		  XPath xPath2 = DocumentHelper.createXPath(ServiceXPaths.getXPath(ServiceXPaths.OPERATES_ON,namespaceURIs));
		  xPath2.setNamespaceURIs(namespaceURIs);

		  List<Node> asResultsNodes2 = xPath2.selectNodes(document.getRootElement());		

		  for(int i=0;i<asResultsNodes2.size();i++){
			  
			  DatasetElements dataSet=new DatasetElements();
			  		  
			  String respDS=CSWUtil.executeRequest(cswURL, asResultsNodes2.get(i).getText(), proxyHost, proxyPort);
			  Document document2 = reader.read(new StringReader(respDS));
			  namespaceURIs = Namespaces.getNamespaces(respDS);
			  dataSet.setCodeUUID(getElement(DatasetXPaths.getXPath(DatasetXPaths.UUID,namespaceURIs), namespaceURIs, document2));
			  dataSet.setId(getElement(DatasetXPaths.getXPath(DatasetXPaths.FILE_ID,namespaceURIs), namespaceURIs, document2));
			  dataSet.setTitle(getElement(DatasetXPaths.getXPath(DatasetXPaths.TITLE,namespaceURIs), namespaceURIs, document2));
			  dataSet.setDesc(getElement(DatasetXPaths.getXPath(DatasetXPaths.DESC,namespaceURIs), namespaceURIs, document2));
			  dataSet.setDateStamp(getElement(DatasetXPaths.getXPath(DatasetXPaths.DATE_STAMP,namespaceURIs), namespaceURIs, document2));
			  dataSet.setRights(getElement(DatasetXPaths.getXPath(DatasetXPaths.RIGHTS,namespaceURIs), namespaceURIs, document2));
			  dataSet.setAuthorName(getElement(DatasetXPaths.getXPath(DatasetXPaths.AUTHOR_NAME,namespaceURIs), namespaceURIs, document2));
			  dataSet.setAuthorMail(getElement(DatasetXPaths.getXPath(DatasetXPaths.AUTHOR_MAIL,namespaceURIs), namespaceURIs, document2));
			  dataSet.setOrganisationName(getElement(DatasetXPaths.getXPath(DatasetXPaths.ORG_NAME,namespaceURIs), namespaceURIs, document2));  
			  dataSet.setBBOXwest(getElement(DatasetXPaths.getXPath(DatasetXPaths.BBOX_WEST,namespaceURIs), namespaceURIs, document2));
			  dataSet.setBBOXeast(getElement(DatasetXPaths.getXPath(DatasetXPaths.BBOX_EAST,namespaceURIs), namespaceURIs, document2));
			  dataSet.setBBOXsouth(getElement(DatasetXPaths.getXPath(DatasetXPaths.BBOX_SOUTH,namespaceURIs), namespaceURIs, document2));
			  dataSet.setBBOXnorth(getElement(DatasetXPaths.getXPath(DatasetXPaths.BBOX_NORTH,namespaceURIs), namespaceURIs, document2));
			  dataSet.setType(getElement(DatasetXPaths.getXPath(DatasetXPaths.TYPE,namespaceURIs), namespaceURIs, document2));
			  dataSet.setLanguage(getElement(DatasetXPaths.getXPath(DatasetXPaths.LANGUAGE,namespaceURIs), namespaceURIs, document2));
			  dataSet.setBrowseGraphic(getElement(DatasetXPaths.getXPath(DatasetXPaths.BROWSE_GRAPHIC,namespaceURIs), namespaceURIs, document2));
			  
			  List<String> dsURLList=new ArrayList<String>();
			  List<String> dsDescriptionList=new ArrayList<String>();
			  List<String> dsCodeListValueList=new ArrayList<String>();
			  List<String> dsNameValueList=new ArrayList<String>();
			  List<String> dsAppProfileValueList=new ArrayList<String>();
			  
			  
			  XPath xPath8 = DocumentHelper.createXPath(DatasetXPaths.getXPath(DatasetXPaths.ONLINE_RESSOURCE,namespaceURIs));
			  xPath8.setNamespaceURIs(namespaceURIs);
			  List<Node> asResultsNodes8 = xPath8.selectNodes(document2.getRootElement());
			  for(int j=0;j<asResultsNodes8.size();j++){
				  XPath xPath9 = DocumentHelper.createXPath(DatasetXPaths.getXPath(DatasetXPaths.ONLINE_RESSOURCE_DESC_SUB,namespaceURIs));
				  XPath xPath10 = DocumentHelper.createXPath(DatasetXPaths.getXPath(DatasetXPaths.ONLINE_RESSOURCE_URL_SUB,namespaceURIs));
				  XPath xPath11 = DocumentHelper.createXPath(DatasetXPaths.getXPath(DatasetXPaths.ONLINE_RESSOURCE_CODE_SUB,namespaceURIs));
				  //XPath xPath12 = DocumentHelper.createXPath(DatasetXLinks.getXPath(DatasetXPaths.ONLINE_RESSOURCE_PROTOCOL_SUB,namespaceURIs));
				  XPath xPath13 = DocumentHelper.createXPath(DatasetXPaths.getXPath(DatasetXPaths.ONLINE_RESSOURCE_PROFILE_SUB,namespaceURIs));
				  XPath xPath14 = DocumentHelper.createXPath(DatasetXPaths.getXPath(DatasetXPaths.ONLINE_RESSOURCE_NAME_SUB,namespaceURIs));						  
				  
				  xPath9.setNamespaceURIs(namespaceURIs);
				  xPath10.setNamespaceURIs(namespaceURIs);
				  xPath11.setNamespaceURIs(namespaceURIs);
				  //xPath12.setNamespaceURIs(namespaceURIs);
				  xPath13.setNamespaceURIs(namespaceURIs);
				  xPath14.setNamespaceURIs(namespaceURIs);
				  
				  List<Node> asResultsNodes9 = xPath9.selectNodes(asResultsNodes8.get(j));
				  List<Node> asResultsNodes10 = xPath10.selectNodes(asResultsNodes8.get(j));
				  List<Node> asResultsNodes11 = xPath11.selectNodes(asResultsNodes8.get(j));
				  //List<Node> asResultsNodes12 = xPath12.selectNodes(asResultsNodes8.get(j));
				  List<Node> asResultsNodes13 = xPath13.selectNodes(asResultsNodes8.get(j));
				  List<Node> asResultsNodes14 = xPath14.selectNodes(asResultsNodes8.get(j));
				  
				  String desc = "";
				  String url ="";
				  String code = "";
				  //String protocol = "";
				  String appProfile = "";
				  String name = "";
				  
				  if(asResultsNodes9.size() > 0){
					  desc =asResultsNodes9.get(0).getStringValue();
				  }
				  if(asResultsNodes10.size() > 0){
					  url = asResultsNodes10.get(0).getStringValue();
				  }
				  if(asResultsNodes11.size() > 0){
					  code =asResultsNodes11.get(0).getStringValue();
				  }
//					  if(asResultsNodes12.size() > 0l){
//						  protocol =asResultsNodes12.get(0).getStringValue();
//					  }
				  if(asResultsNodes13.size() > 0){
					  appProfile =asResultsNodes13.get(0).getStringValue();
				  }
				  if(asResultsNodes14.size() > 0){
					  name =asResultsNodes14.get(0).getStringValue();
				  }
				  								  
				  dsURLList.add(url.replaceAll("&", "&amp;"));
				  dsDescriptionList.add(desc.replaceAll("&", "&amp;"));
				  dsCodeListValueList.add(code.replaceAll("&", "&amp;"));
				  dsNameValueList.add(name.replaceAll("&", "&amp;"));
				  dsAppProfileValueList.add(appProfile.replaceAll("&", "&amp;"));

			  }
			  dataSet.setURLList(dsURLList);
			  dataSet.setDescriptionList(dsDescriptionList);
			  dataSet.setCodeListValueList(dsCodeListValueList);
			  dataSet.setNameList(dsNameValueList);
			  dataSet.setAppProfileList(dsAppProfileValueList);
			  
			  dataSetList.add(dataSet);
		  }
		 
		  writeFeed(serviceElements, dataSetList, downloadUUID);
	}
	
	/**
	 * Steuert die Generierung der Feed und OpenSearch Dokumente und schreibt diese in Dateien.
	 * 
	 * @param serviceElements
	 * @param dataSetList
	 * @param downloadUUID
	 */
	private void writeFeed(ServiceElements serviceElements, List<DatasetElements> dataSetList, String downloadUUID){
		String language = getLanguageCode(serviceElements.getLanguage());
		
		HashMap<String,String> params = new HashMap<String,String>();
		params.put("cswURL", cswURL);
		params.put("feedURL", feedURL);
		params.put("servicePath", servicePath);
		params.put("opensearchPath", opensearchPath);
		params.put("downloadUUID", downloadUUID);
		params.put("language", language);
		params.put("dataSetPath", dataSetPath);
		params.put("transOpt", this.transOpt);
		
		log.info("Writing Service Feed file");
		try {
			File file = new File(servletContext.getRealPath("/")+servicePath+"Service_"+downloadUUID+".xml");
			file.getParentFile().mkdirs();
			log.info("File created");
					
			log.info("##############");
			String serviceDoc = ServiceFeedDocBuilder.encode(serviceElements, dataSetList, params);
			log.info(serviceDoc);
			log.info("##############");
			FeedWriter feedWriter = new FeedWriter(file);
			feedWriter.write(serviceDoc);
			feedWriter.close();
			log.info("file written");
			JPAManager.addService(serviceElements.getTitle(),downloadUUID,serviceElements.getBrowseGraphic());
			log.info("service data saved");
		}catch (InvalidCoupledRessourceException e) {
			log.error(e.toString(), e.fillInStackTrace());
			e.printStackTrace();
		}catch (IOException e) {
			log.error(e.toString(), e.fillInStackTrace());
			e.printStackTrace();
		}catch (Exception e) {
			log.error(e.toString(), e.fillInStackTrace());
			e.printStackTrace();
		}
		
		log.info("Writing "+dataSetList.size()+" Dataset Feed files");
		
		if(dataSetList.size() > 0){			
			List<DatasetElements> dataSetListS = new ArrayList<DatasetElements>();
			//List<DatasetElements> dataSetListOS=new ArrayList<DatasetElements>();
			
			for(int i = 0; i < dataSetList.size();i++){
				if(dataSetList.get(i).getType().equals("tile")){
					dataSetListS.add(dataSetList.get(i));
				}
//				else{
//					dataSetListOS.add(dataSetList.get(i));
//				}
			}
			
			//dataSetList = dataSetListOS;
				
			try {
							
				for(int i = 0; i < dataSetList.size();i++){
					
					log.info("Writing Dataset Feed file "+i);
					
					DatasetElements temp=null;
					try{
						temp=dataSetList.get(i);
					}catch(IndexOutOfBoundsException e){
						log.error("inside list of linked data sets");
						log.error(e.toString(), e.fillInStackTrace());
						e.printStackTrace();
					}
					String languageDS=getLanguageCode(temp.getLanguage());
					if(!temp.getType().equals("tile")){
						params.put("language", languageDS);
						
						File file = new File(servletContext.getRealPath("/")+dataSetPath+"DataSet_"+temp.getId()+".xml");
						file.getParentFile().mkdirs();
						
						String datasetDoc = DatasetFeedDocBuilder.encode(serviceElements, temp, params,dataSetListS);
						FeedWriter feedWriter = new FeedWriter(file);
						feedWriter.write(datasetDoc);
						feedWriter.close();				
					}
					
					List<String> epsgCodes = new ArrayList<String>();
					
					for(int j =0;j<temp.getDescriptionList().size();j++){
						try{
							String[] codeUUIDResult = temp.getCodeUUID().split("#");
							
							if(codeUUIDResult.length == 0){
								throw new InvalidCoupledRessourceException();
							}
							
							if(this.transOpt.equals("old")){
								if(temp.getCodeListValueList().get(j).equals("download") && temp.getDescriptionList().get(j).contains("Atom")){
	
									
									String[] splitResult = temp.getDescriptionList().get(j).split("#");
									String[] epsgResult = splitResult[3].split(":");
									
									epsgCodes.add(epsgResult[1].trim());
	
									JPAManager.addDataset(temp.getId(),epsgResult[1],splitResult[0].trim()+" ("+splitResult[2].trim()+") - "+splitResult[3].trim(),temp.getURLList().get(j),languageDS,codeUUIDResult[0],splitResult[2].trim(),temp.getTitle(),downloadUUID,temp.getRights(),temp.getOrganisationName(),temp.getBrowseGraphic(),temp.getBBOX());
								}
							}
							
							if(this.transOpt.equals("new")){
								if(temp.getCodeListValueList().get(j).equals("download") && temp.getNameList().get(j).contains("predefined ATOM")){
									String[] descSplit = temp.getDescriptionList().get(j).split(" ");
									String epsgValue ="";
									for(int k = 0; k < descSplit.length; k++){
										if(descSplit[k].contains("EPSG:")){
											epsgValue=descSplit[k].substring(6,descSplit[k].length());
											break;
										}
									}
																	
									epsgCodes.add(epsgValue);
	
									JPAManager.addDataset(temp.getId(),epsgValue,temp.getDescriptionList().get(j)+" ("+temp.getAppProfileList().get(j)+")",temp.getURLList().get(j),languageDS,codeUUIDResult[0],temp.getAppProfileList().get(j),temp.getTitle(),downloadUUID,temp.getRights(),temp.getOrganisationName(),temp.getBrowseGraphic(),temp.getBBOX());
								}
							}
						}catch(IndexOutOfBoundsException e){
							log.error("in data set "+temp.getTitle()+" at index "+j);
							log.error(e.toString(), e.fillInStackTrace());
							e.printStackTrace();
						}
					}
					
				}
	
			}catch (FileNotFoundException e) {
				log.error(e.toString(), e.fillInStackTrace());
				e.printStackTrace();
			}catch (UnsupportedEncodingException e) {
				log.error(e.toString(), e.fillInStackTrace());
				e.printStackTrace();
			}catch (IOException e) {
				log.error(e.toString(), e.fillInStackTrace());
				e.printStackTrace();
			}catch (InvalidCoupledRessourceException e) {
				log.error(e.toString(), e.fillInStackTrace());
				e.printStackTrace();
			}
				
		}
		
		log.info("Writing OpenSearch Description file");
		
		try {		
			File file = new File(servletContext.getRealPath("/")+opensearchPath+"OpenSearch_"+downloadUUID+".xml");
			file.getParentFile().mkdirs();
			
			HashMap<String,String> paramsOS = new HashMap<String,String>();
			paramsOS.put("feedURL", feedURL);
			paramsOS.put("downloadUUID", downloadUUID);
			paramsOS.put("authorMail", serviceElements.getAuthorMail());
						
			FeedWriter feedWriter = new FeedWriter(file);
						
			List<String> types = new ArrayList<String>();
						
			for(int i = 0; i < dataSetList.size();i++){
				DatasetElements temp=dataSetList.get(i);
				if(this.transOpt.equals("old")){
					for(int j = 0; j < temp.getDescriptionList().size();j++){
						String[] descResult = temp.getDescriptionList().get(j).split("#");	
						if(descResult.length == 4){
							String type = descResult[2].trim();	
							if(!types.contains(type)){
								types.add(type);
							}
						}
					}			
				}
				if(this.transOpt.equals("new")){
					for(int j = 0; j < temp.getAppProfileList().size();j++){
						if(!types.contains(temp.getAppProfileList().get(j))){
							if(!temp.getAppProfileList().get(j).equals("")){
								types.add(temp.getAppProfileList().get(j));
							}
						}
					}
				}
			}
						
			String desc = "";
			
			if(serviceElements.getDesc().length() > 1024){
				String[] descsplit = serviceElements.getDesc().split("\\s+");
				
				for(int j = 0; j < descsplit.length; j++){
					String desctemp = desc + descsplit[j] +" ";
					if(desctemp.length() < 1024){
						desc = desctemp;
					}else{
						break;
					}
					
				}
				
				desc = desc.substring(0, desc.length()-1);
				
			}else{
				desc = serviceElements.getDesc();
			}
			
			paramsOS.put("desc", desc);
				
			List<String> keywords = serviceElements.getKeywords();
			String keytemp="";
			for(int i = 0; i<keywords.size();i++){
				
				String keyvaluetemp = keytemp + keywords.get(i) +" ";
				if(keyvaluetemp.length() < 256){
					keytemp = keyvaluetemp;
				}else{
					break;
				}			
			}
			
			keytemp=keytemp.substring(0,keytemp.length()-1);
			
			paramsOS.put("keytemp", keytemp);
			
			String[] titlesplitstring=serviceElements.getTitle().split("\\s+");	
			String shortname = titlesplitstring[0];
			if(shortname.length() > 15){
				shortname = shortname.substring(0, 15);
			}
			
			paramsOS.put("shortname", shortname);
						
			String longname = "";
			
			if(serviceElements.getTitle().length() > 48){
				String[] longnamesplit = serviceElements.getTitle().split(" ");
				
				for(int j = 0; j < longnamesplit.length; j++){
					String longnametemp = longname + longnamesplit[j] +" ";
					if(longnametemp.length() < 48){
						longname = longnametemp;
					}else{
						break;
					}
					
				}
				
				longname = longname.substring(0, longname.length()-1);
				
			}else{
				longname = serviceElements.getTitle();
			}
			
			paramsOS.put("longname", longname);
						
			String browseGraphic = serviceElements.getBrowseGraphic();
			String[] imageSplit=browseGraphic.split("\\.");

			paramsOS.put("imageType", imageSplit[imageSplit.length-1]);
			paramsOS.put("browseGraphic", browseGraphic);
			paramsOS.put("transOpt", this.transOpt);			
			paramsOS.put("orgName", serviceElements.getOrgName());
			paramsOS.put("language", language);
			
			String opensearchDoc = OpenSearchDocBuilder.encode(dataSetList, paramsOS, types);
			feedWriter.write(opensearchDoc);
			feedWriter.close();
			
			log.info(downloadUUID+": Process succesfully finished!");
		}catch (FileNotFoundException fnfe) {
			log.error(fnfe.toString(), fnfe.fillInStackTrace());
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			log.error(ioe.toString(), ioe.fillInStackTrace());
			ioe.printStackTrace();
		}
	}
	
	/**
	 * Extrahiert einen String-Wert aus einem XML-Element
	 * 
	 * @param exp
	 * @param namespaceURIs
	 * @param document
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String getElement(String exp, @SuppressWarnings("rawtypes") Map namespaceURIs, Document document){
		  XPath xPath = DocumentHelper.createXPath(exp);
		  xPath.setNamespaceURIs(namespaceURIs);

		  List<Node> asResultsNodes = xPath.selectNodes(document.getRootElement());
		  try{
			  String element = asResultsNodes.get(0).getStringValue();
			  return element.replaceAll("&", "&amp;");			  
		  }catch(Exception e){
			  return "";
		  }
	}	
	
	private String getLanguageCode(String language){
		HashMap<String,String> langCodes = new HashMap<String,String>();

		langCodes.put("bul", "bg");
		langCodes.put("cze", "cs");
		langCodes.put("dan", "da");
		langCodes.put("dut", "nl");
		langCodes.put("eng", "en");
		langCodes.put("est", "et");
		langCodes.put("fin", "fi");
		langCodes.put("fre", "fr");
		langCodes.put("ger", "de");
		langCodes.put("gre", "el");
		langCodes.put("hrv", "hr");
		langCodes.put("hun", "hu");
		langCodes.put("gle", "ga");
		langCodes.put("ice", "is");
		langCodes.put("ita", "it");
		langCodes.put("lav", "lv");
		langCodes.put("lit", "lt");
		langCodes.put("mlt", "mt");
		langCodes.put("nor", "no");
		langCodes.put("pol", "pl");
		langCodes.put("por", "pt");
		langCodes.put("roh", "rm");
		langCodes.put("rum", "ro");
		langCodes.put("slo", "sk");
		langCodes.put("slv", "sl");
		langCodes.put("spa", "es");
		langCodes.put("swe", "sv");
		
		return langCodes.get(language);
	}
		
	/**
	 * Laed die Konfigurationsdatei ein, um zur Laufzeit veraenderte Parameter zu beruecksichtigen. 
	 */
	private void loadProperties(){
		Properties properties = new Properties();
		try{
			log.info("-------------------------------------------------------------------");
			log.info("Updating config settings");

			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
			servletContext.setAttribute("properties", properties);
			
			this.cswURL=(String)properties.get("cswURL");
			this.proxyHost=(String)properties.get("proxyHost");
			if(!this.proxyHost.equals("") && this.proxyHost != null){
				this.proxyPort=Integer.parseInt((String)properties.get("proxyPort"));
			}
			this.feedURL=(String)properties.get("feedURL");
			this.servicePath=(String)properties.get("servicePath");
			this.dataSetPath=(String)properties.get("dataSetPath");
			this.opensearchPath=(String)properties.get("opensearchPath");
			this.downloadUUIDs=(String)properties.get("serviceUUIDs");	
			this.transOpt=(String)properties.get("transOpt");	
			
		  }catch (Exception e){
			  log.error(e.toString(), e.fillInStackTrace());
			  System.out.println("Error: " + e.getMessage());
		  }	
	 }
}
