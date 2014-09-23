package mdide.atomFeedGen.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * Stellt die Funktion zum Abrufen von Metadaten zur verfuegung.
 * 
 * @author Mathias Luecker
 *
 */
public class CSWUtil {
	static Logger log = Logger.getLogger(CSWUtil.class);
	
	/**
	 * Ruft die Metadaten mit der uebergebenen UUID von der uebergebenen CSW ab.
	 * 
	 * @param cswURL
	 * @param mdID
	 * @param proxyHost
	 * @param proxyPort
	 * @return
	 */
	public static String executeRequest(String cswURL, String mdID, String proxyHost, int proxyPort){

		String resp ="";
				  
		try {
			
			HttpHost proxy = new HttpHost(proxyHost, proxyPort, "http");
			final HttpParams httpParams = new BasicHttpParams();
		    HttpConnectionParams.setConnectionTimeout(httpParams, 30000);
			HttpClient httpclient = new DefaultHttpClient(httpParams);
			if(!proxyHost.equals("")){
				httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
			}
			log.info("execute getRecordById Request with UUID "+mdID);
			HttpGet httpget = new HttpGet(cswURL+"Service=CSW&Version=2.0.2&ElementSetName=full&outputSchema=http://www.isotc211.org/2005/gmd&Request=GetRecordById&Id="+mdID);
			HttpResponse response = httpclient.execute(httpget);
			HttpEntity resEntity = response.getEntity();
			resp = EntityUtils.toString(resEntity);
			EntityUtils.consume(resEntity);
			httpclient.getConnectionManager().shutdown();
		} catch(Exception e){
			log.error(e.toString(), e.fillInStackTrace());
			return resp;		  
		}
		return resp;	
	}

}
