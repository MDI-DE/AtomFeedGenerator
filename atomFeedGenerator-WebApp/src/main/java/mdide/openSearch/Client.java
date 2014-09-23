package mdide.openSearch;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import mdide.model.Dataset;
import mdide.model.JPAManager;
import mdide.model.Service;


/**
* Client zur Anzeige alle Datensaetze und Srvice-Feeds<br />
*
* @author Mathias Luecker, Michael Raeder
*/
public class Client extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String DETAIL_IMAGE ="<img class='center' id='showDetail' src='/atomFeed/images/details_open.png'>"; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("request");
		String serviceId = request.getParameter("serviceId");
		PrintWriter out = response.getWriter();
		response.setContentType("application/json"); 
		
		JSONObject obj=new JSONObject();
		JSONArray resultsArray = new JSONArray();
		
		if(action.equals("getTableData")){
			List<Dataset> datasets;
			if(!serviceId.equals("")){
				datasets = JPAManager.getDataSetsByServiceId(serviceId);
				
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
		}if(action.equals("getServices")){
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
	}

}
