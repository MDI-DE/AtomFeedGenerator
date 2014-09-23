package mdide.openSearch;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mdide.model.Dataset;
import mdide.model.JPAManager;
import mdide.model.Service;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class RestClient
 */
public class RestClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String DETAIL_IMAGE ="<img class='center' id='showDetail' src='/atomFeed/images/details_open.png'>"; 
	static Logger log = Logger.getLogger(RestClient.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestClient() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
			
		try{
			RestRequest resourceValues = new RestRequest(request.getPathInfo());
			response.setContentType("application/json");
			
			JSONObject obj=new JSONObject();
			JSONArray resultsArray = new JSONArray();
			
			if(resourceValues.getRessource().equals("datasets")){
				List<Dataset> datasets;
				if(!resourceValues.getServiceId().equals("")){
					datasets = JPAManager.getDataSetsByServiceId(resourceValues.getServiceId());			
				}else{
					datasets = JPAManager.getDataSets();				
				}
				if(datasets.size() == 0){
					JSONObject element=new JSONObject();
					element.put("detailImage", this.DETAIL_IMAGE);
					element.put("title", "");
					element.put("uuid", "");
					element.put("link", "");
					element.put("epsg", "");
					element.put("type", "");
					element.put("rights", "");
					element.put("organisation", "");
					element.put("browseGraphic", "");
					element.put("bbox", "");
					resultsArray.add(element);
				}
				for(int i = 0; i < datasets.size(); i++){ 
					 JSONObject element=new JSONObject();
					 element.put("detailImage", this.DETAIL_IMAGE);
					 element.put("title", datasets.get(i).getDescription());
					 element.put("uuid", datasets.get(i).getUuid());
					 element.put("link", datasets.get(i).getDatalink());
					 element.put("epsg", datasets.get(i).getCrs());
					 element.put("type", datasets.get(i).getType());
					 element.put("rights", datasets.get(i).getRights());
					 element.put("organisation", datasets.get(i).getOrganisation());
					 element.put("browseGraphic", datasets.get(i).getBrowseGraphic());
					 element.put("bbox", datasets.get(i).getBbox());
					 resultsArray.add(element);
				}
				obj.put("aaData", resultsArray);
			}if(resourceValues.getRessource().equals("services")){
				List<Service> services = JPAManager.getServices();

				if(services.size() == 0){
					JSONObject element=new JSONObject();
					element.put("title", "");
					element.put("uuid", "");
					resultsArray.add(element);
				}
				for(int i = 0; i < services.size(); i++){ 
					JSONObject element=new JSONObject();
					element.put("title", services.get(i).getTitle());
					element.put("uuid", services.get(i).getUuid());
					element.put("browseGraphic", services.get(i).getBrowseGraphic());
					resultsArray.add(element);
				}	
				obj.put("services", resultsArray);
			}
			
		    out.println(obj.toJSONString());
			out.close();
			
		}catch(ServletException e){
			response.setStatus(400);
			response.resetBuffer();
			e.printStackTrace();
			out.println(e.toString());
		}
		out.close();
	}

}
