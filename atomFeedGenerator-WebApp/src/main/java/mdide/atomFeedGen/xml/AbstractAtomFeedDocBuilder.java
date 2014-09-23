package mdide.atomFeedGen.xml;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.w3.x2005.atom.LinkType;

/**
 * Abstrakte Klasse mit Funktionen zum Erstellen von AtomFeed-Dateien
 * 
 * @author Mathias Luecker
 *
 */
public abstract class AbstractAtomFeedDocBuilder {
	static Logger log = Logger.getLogger(AbstractAtomFeedDocBuilder.class);
	/**
	 * Erzeugt ein Link-Objekt aus den uebergebenen Parametern
	 * 
	 * @param href
	 * @param rel
	 * @param type
	 * @param title
	 * @param lang
	 * @param length
	 * @return
	 */
	protected static LinkType getLinkType(String href, String rel, String type, String title, String lang,String time,String bbox, BigInteger length){
		LinkType link = LinkType.Factory.newInstance();
		link.setHref(href);
		link.setRel(rel);
		link.setType(type);
		link.setTitle(title);	

		if(lang != null){
			link.setHreflang(lang);
		}	
		if(length != null){
			link.setLength(length);
		}
		if(time != null){
			XmlCursor linkcursor= link.newCursor();
			linkcursor.toNextToken();
			linkcursor.insertAttributeWithValue("time",time);
		}
		if(bbox != null){
			XmlCursor linkcursor= link.newCursor();
			linkcursor.toNextToken();
			linkcursor.insertAttributeWithValue("bbox",bbox);
		}

		return link;
	}
	
	/**
	 * Erzeugt einen XmlString mit dem uebergebenen Inhalt
	 * 
	 * @param value
	 * @return
	 */
	protected static XmlString getXmlString(String value){
		XmlString xmlString = XmlString.Factory.newInstance();
		xmlString.setStringValue(value);
		return xmlString;
	}
	
	/**
	 * Stellt allgeimeine Einstellungen zur Formatierung und XML-Erzeugung bereit.
	 * 
	 * @param language
	 * @return
	 */
	protected static XmlOptions getXmlOptions(){
		XmlOptions xmlOptions = new XmlOptions();
		xmlOptions.setSavePrettyPrint();
		xmlOptions.setSavePrettyPrintIndent(3);
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setCharacterEncoding("UTF-8");
		HashMap<String, String> nsMap = new HashMap<String, String>();

		nsMap.put("http://www.w3.org/2005/Atom", "atom");
		nsMap.put("http://inspire.ec.europa.eu/schemas/inspire_dls/1.0", "inspire_dls");
		nsMap.put("http://www.georss.org/georss", "georss");

		xmlOptions.setSaveSuggestedPrefixes(nsMap);
		
		return xmlOptions;
		
	}
	
	protected static String xmlToString(XmlObject doc) throws UnsupportedEncodingException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			doc.save(baos, getXmlOptions());
		} catch (Exception e){
			log.error(e.toString(), e.fillInStackTrace());
			e.printStackTrace();
		}
		
		return baos.toString("UTF-8");
	}
}
