package mdide.model;

/**
* Beinhaltet Dataset-Daten fuer Hibernate ORM<br />
*
* @author Mathias Luecker, Michael Raeder
*/
public class Dataset {
	
	private String uuid;
	private String crs;
	private String datalink;
	private String language;
	private String type;
	private String title;
	private String namespace;
	private String description;
	private String rights;
	private String organisation;
	private Integer id;
	private String serviceId;
	private String browseGraphic;
	private String bbox;
	
	public Integer getId() {
		  return id;
	}
	public void setId(Integer id) {
		  this.id = id;
	}
	public String getServiceId() {
		  return serviceId;
	}
	public void setServiceId(String serviceId) {
		  this.serviceId = serviceId;
	}
	public void setUuid(String uuid){
		this.uuid=uuid;
	}
	public void setCrs(String crs){
		this.crs=crs;
	}
	public void setDatalink(String datalink){
		this.datalink=datalink;
	}
	public void setLanguage(String language){
		this.language=language;
	}
	public void setType(String type){
		this.type=type;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setNamespace(String namespace){
		this.namespace=namespace;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public void setRights(String rights){
		this.rights=rights;
	}
	public void setOrganisation(String organisation){
		this.organisation=organisation;
	}
	
	public String getUuid(){
		return this.uuid;
	}
	public String getCrs(){
		return this.crs;
	}
	public String getDatalink(){
		return this.datalink;
	}
	public String getLanguage(){
		return this.language;
	}
	public String getType(){
		return this.type;
	}
	public String getTitle(){
		return this.title;
	}
	public String getNamespace(){
		return this.namespace;
	}
	public String getDescription(){
		return this.description;
	}
	public String getRights(){
		return this.rights;
	}
	public String getOrganisation(){
		return this.organisation;
	}
	public String getBrowseGraphic(){
		return this.browseGraphic;
	}
	public String getBbox(){
		return this.bbox;
	}
	public void setBrowseGraphic(String browseGraphic){
		this.browseGraphic=browseGraphic;
	}
	public void setBbox(String bbox){
		this.bbox=bbox;
	}
}
