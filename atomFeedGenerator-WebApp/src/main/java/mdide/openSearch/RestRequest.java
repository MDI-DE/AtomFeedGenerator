package mdide.openSearch;

import javax.servlet.ServletException;

public class RestRequest {
	private String ressource="";
	private String serviceId="";
	
	public RestRequest(String pathInfo) throws ServletException{
		String[] reqParts=pathInfo.split("/");
			
		if(reqParts.length == 2){
			if(reqParts[1].equals("datasets")||reqParts[1].equals("services")){
				this.ressource = reqParts[1];
			}else{
				throw new ServletException("Invalid URI");
			}
		}else if(reqParts.length == 4){
			if(reqParts[2].equals("serviceId")){
				this.serviceId = reqParts[3];
			}else{
				throw new ServletException("Invalid URI");
			}
		}else{
			throw new ServletException("Invalid URI");
		}		
	}
		
	public String getRessource() {
		return ressource;
	}
	public void setRessource(String ressource) {
		this.ressource = ressource;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	
}
