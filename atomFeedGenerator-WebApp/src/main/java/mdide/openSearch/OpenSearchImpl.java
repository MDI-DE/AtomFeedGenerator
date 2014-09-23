package mdide.openSearch;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mdide.model.Dataset;
import mdide.model.JPAManager;

import org.hibernate.HibernateException;
import org.apache.log4j.Logger;


/**
* OpenSearch-Impelmentierung<br />
*
* @author Mathias Luecker, Michael Raeder
*/
public class OpenSearchImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int BUFSIZE = 4096;
	static Logger log = Logger.getLogger(OpenSearchImpl.class);
	private Properties properties;
	private ServletContext context;

	/**
	 * Verarbeitung der Requests an die OpenSearch-Schnittstelle
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		context = getServletContext(); 
		properties = (Properties)context.getAttribute("properties");
		
		Properties requestParameters = new Properties();
		
		try{
			String queryString = request.getQueryString();
			if(queryString.contains("&amp;")){
				String[] querySplit = queryString.split("&amp;");
				for(int i = 0; i < querySplit.length; i++){
					String[] paramSplit = querySplit[i].split("=");
					requestParameters.setProperty(paramSplit[0], paramSplit[1]);
				}
			}else if(queryString.contains("%26")){
				String[] querySplit = queryString.split("%26");
				for(int i = 0; i < querySplit.length; i++){
					String[] paramSplit = querySplit[i].split("=");
					requestParameters.setProperty(paramSplit[0], paramSplit[1]);
				}
			}
			else{
				String[] querySplit = queryString.split("&");
				for(int i = 0; i < querySplit.length; i++){
					String[] paramSplit = querySplit[i].split("=");
					requestParameters.setProperty(paramSplit[0], paramSplit[1]);
				}
			}
		}catch(Exception e){
			log.error(e.toString(), e.fillInStackTrace());
		}
		
		String action = requestParameters.getProperty("request");
		String q =  requestParameters.getProperty("q");
				
		if(q==null && action == null){
			response.sendRedirect("http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/error_page/err.html");
		}
		
		if(q != null){
			String filePath=context.getRealPath("/")+properties.getProperty("dataSetPath")+"DataSet_"+q.toLowerCase()+".xml";
			processRequest(request, response, requestParameters, filePath);
		}else if(action != null){
			action = action.toLowerCase();
			if(action.equals("getopensearchdescriptiondocument")){
				String filePath=context.getRealPath("/")+properties.getProperty("opensearchPath")+"OpenSearch_"+requestParameters.getProperty("service_identifier_code")+".xml";
				processRequest(request, response, requestParameters, filePath);
			}
			if(action.equals("getdatasetfeed")){
				String filePath=context.getRealPath("/")+properties.getProperty("dataSetPath")+"DataSet_"+requestParameters.getProperty("spatial_dataset_identifier_code")+".xml";	        
				processRequest(request, response, requestParameters, filePath);
			}
			if(action.equals("getdataset")){
				
				try {
					String type = requestParameters.getProperty("type").toLowerCase();
					String crs = requestParameters.getProperty("crs").toLowerCase();
					if(crs.contains("opengis")){
						crs= crs.split("/")[7];
					}
					
					String uuid = requestParameters.getProperty("spatial_dataset_identifier_code").toLowerCase();
					
					List<Dataset> datasets = JPAManager.getDataSetsByUUID(uuid);
					 
					 for(int i = 0; i < datasets.size(); i++){
						 String crsTemp = datasets.get(i).getCrs();
						 String typeTemp = datasets.get(i).getType();
						 String uuidTemp = datasets.get(i).getUuid();
						 
						 if(crsTemp.equals(crs) && typeTemp.equals(type) && uuidTemp.equals(uuid)){
							 response.sendRedirect(response.encodeRedirectURL(datasets.get(i).getDatalink().replace("&amp;", "&")));
						 }
					 }
				} catch (HibernateException e) {
					response.sendRedirect("http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/error_page/err.html");
				}
				
				
			}
		}
	}

	/**
	 * List ein angefragtes AtomFeed Dokument und gibt es als Response zurueck, bzw. erzeugt einen Redirect auf den angefragten Datensatz
	 * 
	 * @param request
	 * @param response
	 * @param requestParameters
	 * @param filePath
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response, Properties requestParameters, String filePath) throws ServletException, IOException{
		try{
			File file = new File(filePath);
			int length = 0;
			ServletOutputStream outStream = response.getOutputStream();
			String mimetype = context.getMimeType(filePath);
			
			if (mimetype == null){
			    mimetype = "application/octet-stream";
			}
			response.setContentType(mimetype);
			response.setContentLength((int)file.length());
			String fileName = (new File(filePath)).getName();
			
			response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
			
			byte[] byteBuffer = new byte[BUFSIZE];
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			
			while ((in != null) && ((length = in.read(byteBuffer)) != -1)){
			    outStream.write(byteBuffer,0,length);
			}
			
			in.close();
			outStream.close();
		}catch (Exception e){
			log.error(e.toString(), e.fillInStackTrace());
			response.sendRedirect("http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/error_page/err.html");
		}
	}

}
