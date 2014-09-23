package mdide.atomFeedGen.xml;

import java.util.HashMap;
import java.util.Map;

/**
 * Stellt die in den Metadaten verwedneten Namespaces bereit
 * 
 * @author Mathias Luecker, Michael Raeder
 *
 */
public class Namespaces {
	
	/**
	 * default Namespaces
	 * 
	 * @return
	 */
	private static Map<String, String> getDefaultNamespaces(){
		
		Map<String, String> namespaceURIs = new HashMap<String, String>();
		namespaceURIs.put("csw", "http://www.opengis.net/cat/csw/2.0.2");
		namespaceURIs.put("gco", "http://www.isotc211.org/2005/gco");
		namespaceURIs.put("gmd", "http://www.isotc211.org/2005/gmd");
		namespaceURIs.put("srv", "http://www.isotc211.org/2005/srv");
		namespaceURIs.put("xsi", "http://www.w3.org/2001/XMLSchema-instance");
		namespaceURIs.put("xlink", "http://www.w3.org/1999/xlink");
		namespaceURIs.put("gts", "http://www.isotc211.org/2005/gts");
		  		  
		return namespaceURIs;
	
	}
	
	/**
	 * Aus den ersten beiden XML-Elementen werden die Namespaces extrahiert
	 * 
	 * @param resp
	 * @return
	 */
	public static Map<String, String> getNamespaces(String resp){
		Map<String, String> namespaceURIs = new HashMap<String, String>();
		String[] respSplit = resp.split("<");
		
		for(int i = 2; i < 4; i++){
			
			String[] tempSplitI = respSplit[i].split(" ");
			
			for(int j = 1; j < tempSplitI.length; j++){
				if(tempSplitI[j].contains("xmlns:")){
					String[] tempSplitJ = tempSplitI[j].split("xmlns:");
					String[] tempSplitJ2 = tempSplitJ[1].split("=");
					String nsShortCut = tempSplitJ2[0];
					String nsURL = tempSplitJ2[1].replaceAll("\"", "");
					namespaceURIs.put(nsShortCut,nsURL);
				}			
			}
		}
		
		if(namespaceURIs.size() > 1){
			return namespaceURIs;
		}else{
			return getDefaultNamespaces();
		}
				
	}

}
