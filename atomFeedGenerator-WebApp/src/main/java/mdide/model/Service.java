package mdide.model;

/**
* Beinhaltet Service-Daten fuer Hibernate ORM<br />
*
* @author Mathias Luecker, Michael Raeder
*/
public class Service {
	
	private Integer id;
	private String title;
	private String uuid;
	private String browseGraphic;
	
	public Integer getId() {
		  return id;
	}
	public void setId(Integer id) {
		  this.id = id;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setUuid(String uuid){
		this.uuid=uuid;
	}
	public String getUuid(){
		return this.uuid;
	}
	public String getBrowseGraphic(){
		return this.browseGraphic;
	}
	public void setBrowseGraphic(String browseGraphic){
		this.browseGraphic=browseGraphic;
	}
}
