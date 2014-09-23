package mdide.atomFeedGen.xml;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.namespace.QName;

import mdide.atomFeedGen.exception.InvalidCoupledRessourceException;
import mdide.atomFeedGen.utils.DatasetElements;
import mdide.atomFeedGen.utils.ServiceElements;

import org.apache.xmlbeans.XmlCursor;
import org.w3.x2005.atom.CategoryType;
import org.w3.x2005.atom.ContentType;
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
 * Generiert ein Dataset-AtomFeed XML
 * 
 * @author Mathias Luecker
 *
 */
public class DatasetFeedDocBuilder extends AbstractAtomFeedDocBuilder{
	
	/**
	 * Erzeugt das AtomFeed XML als String
	 * 
	 * @param serviceElements
	 * @param dataSet
	 * @param params
	 * @return
	 * @throws InvalidCoupledRessourceException
	 * @throws UnsupportedEncodingException 
	 */
	public static String encode(ServiceElements serviceElements, DatasetElements dataSet, HashMap<String, String> params,List<DatasetElements> dataSetListS) throws InvalidCoupledRessourceException, UnsupportedEncodingException{
				
		FeedDocument feedDoc = FeedDocument.Factory.newInstance();
				
		FeedType feed = feedDoc.addNewFeed();
		
		XmlCursor cursor= feed.newCursor();
		cursor.toNextToken();
		cursor.insertNamespace("inspire_dls", "http://inspire.ec.europa.eu/schemas/inspire_dls/1.0");
		cursor.insertNamespace("georss", "http://www.georss.org/georss");
		cursor.insertAttributeWithValue("schemaLocation","http://www.w3.com/2001/XMLSchema-instance", "http://www.w3.org/2005/Atom");
		cursor.dispose();
		
		TextType title = feed.addNewTitle();
		title.set(getXmlString("INSPIRE Dataset Feed: "+dataSet.getTitle()));
		
		TextType subtitle = feed.addNewSubtitle();
		subtitle.set(getXmlString(serviceElements.getTitle()));
				
		LinkType[] linkArray = new LinkType[3];
			
		LinkType link1 = getLinkType(
				params.get("feedURL")+"getFeedDoc?type=DataSet&uuid="+dataSet.getId(),
				"self",
				"application/atom+xml",
				"INSPIRE Dataset Feed: "+dataSet.getTitle(),
				params.get("language"),
				null,
				null,
				null
				);
		linkArray[0]=link1;
		
		LinkType link2 = getLinkType(
				params.get("feedURL")+"getFeedDoc?type=Service&uuid="+params.get("downloadUUID"),
				"up",
				"application/atom+xml",
				"INSPIRE Download Service Feed: "+serviceElements.getTitle(),
				params.get("language"),
				null,
				null,
				null
				);
		linkArray[1]=link2;
		
		LinkType link3 = getLinkType(
				"http://inspire-registry.jrc.ec.europa.eu/registers/FCD/items",
				"describedby",
				"text/html",
				"INSPIRE Feature Concept Dictionary",
				null,
				null,
				null,
				null
				);
		linkArray[2]=link3;
		
		feed.setLinkArray(linkArray);
				
		LogoType logo = feed.addNewLogo();
		logo.setStringValue(dataSet.getBrowseGraphic());

		IdType id = feed.addNewId();
		id.setStringValue(params.get("feedURL")+"getFeedDoc?type=DataSet&uuid="+dataSet.getId());
		
		TextType rights = feed.addNewRights();
		rights.set(getXmlString(dataSet.getRights()));
		
		DateTimeType updated = feed.addNewUpdated();
		updated.setStringValue(dataSet.getDateStamp());
		
		PersonType author = feed.addNewAuthor();
		author.addEmail(dataSet.getAuthorMail());
		author.addName(dataSet.getAuthorName());
			
		List<String> epsgCodes = new ArrayList<String>();
		
		for(int j =0;j<dataSet.getDescriptionList().size();j++){
	    
				if(params.get("transOpt").equals("old")){
					if(dataSet.getCodeListValueList().get(j).equals("download") && dataSet.getDescriptionList().get(j).contains("Atom")){
						String[] splitResult = dataSet.getDescriptionList().get(j).split("#");
						String[] epsgResult = splitResult[3].split(":");
						
						epsgCodes.add(epsgResult[1].trim());
						
						EntryType entry = feed.addNewEntry();
					    TextType entryTitle = entry.addNewTitle();
					    				
						entryTitle.set(getXmlString("INSPIRE Dataset: "+splitResult[0].trim()+" ("+splitResult[2].trim()+") - "+splitResult[3].trim()));
		    		    
					    if(dataSetListS.size() > 0){
					    	ContentType content=entry.addNewContent();
							content.set(getXmlString("Datensatz wird komplett und in "+dataSetListS.size()+" Kacheln ausgeliefert."));
					    }
						
					    LinkType[] entrylinkArray = new LinkType[1+dataSetListS.size()];
						LinkType entrylink1 = getLinkType(
								dataSet.getURLList().get(j),
								"alternate",
								splitResult[2].trim(),
								splitResult[0].trim()+" ("+splitResult[2].trim()+") - "+splitResult[3].trim(),
								params.get("language"),
								null,
								null,
								null
								);
						entrylinkArray[0]=entrylink1;
						
						if(dataSetListS.size() > 0){
							for(int k =1;k<dataSetListS.size()+1;k++){
								String[] splitResultSection = dataSetListS.get(k-1).getDescriptionList().get(j).split("#");
								LinkType entrylinkSection = getLinkType(
										dataSetListS.get(k-1).getURLList().get(j),
										"section",
										splitResultSection[2].trim(),
										splitResultSection[0].trim()+" ("+splitResultSection[2].trim()+") - "+splitResultSection[3].trim(),
										params.get("language"),
										dataSetListS.get(k-1).getDateStamp(),
										dataSetListS.get(k-1).getBBOX(),
										null
										);
								entrylinkArray[k]=entrylinkSection;
							}
						}
						
						entry.setLinkArray(entrylinkArray);
						
						IdType entryId = entry.addNewId();
					    entryId.setStringValue(dataSet.getURLList().get(j));
						
						DateTimeType entryUpdated = entry.addNewUpdated();
						entryUpdated.setStringValue(dataSet.getDateStamp());
						
					    CategoryType entryCategory = entry.addNewCategory();
					    entryCategory.setTerm("http://www.opengis.net/def/crs/EPSG/0/"+epsgResult[1]);
					    entryCategory.setLabel("EPSG "+epsgResult[1]);
						
						XmlCursor cur = entry.newCursor();
					    cur.toEndToken();
					    cur.beginElement(new QName("http://www.georss.org/georss", "box"));
					    cur.insertChars(dataSet.getBBOX());
					    cur.dispose();
													
					}
				}
				
				if(params.get("transOpt").equals("new")){
					if(dataSet.getCodeListValueList().get(j).equals("download") && dataSet.getNameList().get(j).contains("predefined ATOM")){
						String[] descSplit = dataSet.getDescriptionList().get(j).split(" ");
						String epsgValue ="";
						for(int k = 0; k < descSplit.length; k++){
							if(descSplit[k].contains("EPSG:")){
								epsgValue=descSplit[k].substring(6,descSplit[k].length());
								break;
							}
						}
														
						epsgCodes.add(epsgValue);
						
						EntryType entry = feed.addNewEntry();
					    TextType entryTitle = entry.addNewTitle();
						
						entryTitle.set(getXmlString("INSPIRE Dataset: "+dataSet.getDescriptionList().get(j)+" ("+dataSet.getAppProfileList().get(j)+")"));

					    if(dataSetListS.size() > 0){
					    	ContentType content=entry.addNewContent();
							content.set(getXmlString("Datensatz wird komplett und in "+dataSetListS.size()+" Kacheln ausgeliefert."));
					    }
						
					    LinkType[] entrylinkArray = new LinkType[1+dataSetListS.size()];
						LinkType entrylink1 = getLinkType(
								dataSet.getURLList().get(j),
								"alternate",
								dataSet.getAppProfileList().get(j),
								dataSet.getDescriptionList().get(j)+" ("+dataSet.getAppProfileList().get(j)+")",
								params.get("language"),
								null,
								null,
								BigInteger.valueOf(123456)
								);
						entrylinkArray[0]=entrylink1;
						
						if(dataSetListS.size() > 0){
							for(int k =1;k<dataSetListS.size()+1;k++){
								
								LinkType entrylinkSection = getLinkType(
										dataSetListS.get(k-1).getURLList().get(j),
										"section",
										dataSetListS.get(k-1).getAppProfileList().get(j),
										dataSetListS.get(k-1).getDescriptionList().get(j)+" ("+dataSetListS.get(k-1).getAppProfileList().get(j)+")",
										params.get("language"),
										dataSetListS.get(k-1).getDateStamp(),
										dataSetListS.get(k-1).getBBOX(),
										BigInteger.valueOf(123456)
										);
								entrylinkArray[k]=entrylinkSection;
							}
						}
						
						entry.setLinkArray(entrylinkArray);

						IdType entryId = entry.addNewId();
					    entryId.setStringValue(dataSet.getURLList().get(j));
						
						DateTimeType entryUpdated = entry.addNewUpdated();
						entryUpdated.setStringValue(dataSet.getDateStamp());
						
					    CategoryType entryCategory = entry.addNewCategory();
					    entryCategory.setTerm("http://www.opengis.net/def/crs/EPSG/0/"+epsgValue);
					    entryCategory.setLabel("EPSG "+epsgValue);
						
						XmlCursor cur = entry.newCursor();
					    cur.toEndToken();
					    cur.beginElement(new QName("http://www.georss.org/georss", "box"));
					    cur.insertChars(dataSet.getBBOX());
					    cur.dispose();
							
					}
				}
		}	
				
		return xmlToString(feedDoc);	
	}
	
}
