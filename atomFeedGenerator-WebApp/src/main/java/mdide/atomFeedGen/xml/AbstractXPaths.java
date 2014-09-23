package mdide.atomFeedGen.xml;

import java.util.Iterator;
import java.util.Map;

/**
 * 
 * 
 * @author Mathias Luecker
 *
 */
public abstract class AbstractXPaths {
	
	/**
	 * Ersetzt die standard Namespacebezeichnungen durch die tatsaechlich in den Metadaten verwendeten.
	 * 
	 * @param XPATH
	 * @param namespaceURIs
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String getXPath(String XPATH, Map<String, String> namespaceURIs){
		String gmdNS = "gmd";
		String gcoNS = "gco";
		String srvNS = "srv";
	    Iterator it = namespaceURIs.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<String,String> pairs = (Map.Entry<String,String>)it.next();
	        if(pairs.getValue().equals("http://www.isotc211.org/2005/gmd")){
	        	gmdNS = pairs.getKey();
	        }
	        if(pairs.getValue().equals("http://www.isotc211.org/2005/gco")){
	        	gcoNS = pairs.getKey();
	        }
	        if(pairs.getValue().equals("http://www.isotc211.org/2005/srv")){
	        	srvNS = pairs.getKey();
	        }
	    }
	    XPATH = XPATH.replaceAll("gmd:", gmdNS+":");
	    XPATH = XPATH.replaceAll("gco:", gcoNS+":");
	    XPATH = XPATH.replaceAll("srv:", srvNS+":");
	    
	    return XPATH;
	}
}
