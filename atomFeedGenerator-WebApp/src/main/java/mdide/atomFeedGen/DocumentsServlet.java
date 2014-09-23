package mdide.atomFeedGen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;


/**
 * Servlet implementation class DocumentsServlet
 */
public class DocumentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(DocumentsServlet.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DocumentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String,String> requestParams = new HashMap<String,String>();
		
		String queryString = request.getQueryString();
		if(queryString.contains("&amp;")){
			String[] querySplit = queryString.split("&amp;");
			for(int i = 0; i < querySplit.length; i++){
				String[] paramSplit = querySplit[i].split("=");
				requestParams.put(paramSplit[0], paramSplit[1]);
			}
		}else{
			requestParams.put("type", request.getParameter("type"));
			requestParams.put("uuid", request.getParameter("uuid"));
		}

		
		if(requestParams.get("type").equals("OpenSearch") || requestParams.get("type").equals("Service") || requestParams.get("type").equals("DataSet")){
			serveDoc(request, response, requestParams.get("uuid"), requestParams.get("type"));
		}else{
			response.sendRedirect("http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/error_page/err.html");
		}	
	}
	
	protected void serveDoc(HttpServletRequest request, HttpServletResponse response, String uuid, String type) throws IOException{
		
		ServletContext context = getServletContext();
		Properties properties = (Properties)context.getAttribute("properties");
		
		String pathFragment = properties.getProperty("dataSetPath");
		
		if(type.equals("Service")){
			pathFragment = properties.getProperty("servicePath");
		}else if(type.equals("OpenSearch")){
			pathFragment = properties.getProperty("opensearchPath");
		}
		
		String filePath=context.getRealPath("/")+pathFragment+type+"_"+uuid+".xml";
		try{
			File file = new File(filePath);

			String mimetype = "application/atom+xml;charset=UTF-8";
			
			if (type.equals("OpenSearch")){
			    mimetype = "application/opensearchdescription+xml;charset=UTF-8";
			}
			response.setContentType(mimetype);
			response.setContentLength((int)file.length());
			
			FileInputStream in = new FileInputStream(file);
			PrintWriter out = response.getWriter();
			IOUtils.copy(in, out, "UTF-8");
			out.close();
		}catch (Exception e){
			log.error(e.toString(), e.fillInStackTrace());
			response.sendRedirect("http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/error_page/err.html");
		}
	}
	
}
