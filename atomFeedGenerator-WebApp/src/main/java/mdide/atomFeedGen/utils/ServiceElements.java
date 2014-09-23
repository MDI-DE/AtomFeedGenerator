package mdide.atomFeedGen.utils;

import java.util.List;

/**
 * Speichert die XML-Daten eines Service-Metadatensatzes
 * 
 * @author Mathias Luecker, Michael Raeder
 *
 */
public class ServiceElements {
	private String title;
	private String desc;
	private String date_stamp;
	private String rights;
	private String author_name;
	private String author_mail;
	private String org_name;
	private String language;
	private String browse_graphic;
	private  List<String> keywords;
	
	public ServiceElements(){
		
	}
	
	public String getTitle(){
		return this.title;
	}
	public String getDesc(){
		return this.desc;
	}
	public String getRights(){
		return this.rights;
	}
	public String getDateStamp(){
		return this.date_stamp;
	}
	public String getLanguage(){
		return this.language;
	}
	public String getAuthorName(){
		return this.author_name;
	}
	public String getAuthorMail(){
		return this.author_mail;
	}
	public List<String> getKeywords(){
		return this.keywords;
	}
	public String getOrgName(){
		return this.org_name;
	}
	public String getBrowseGraphic(){
		return this.browse_graphic;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public void setDesc(String desc){
		this.desc = desc;
	}
	public void setDateStamp(String date_stamp){
		this.date_stamp = date_stamp;
	}
	public void setRights(String rights){
		this.rights = rights;
	}
	public void setLanguage(String language){
		this.language = language;
	}
	public void setAuthorName(String author_name){
		this.author_name = author_name;
	}
	public void setAuthorMail(String author_mail){
		this.author_mail = author_mail;
	}
	public void setOrgName(String org_name){
		this.org_name = org_name;
	}
	public void setBrowseGraphic(String browse_graphic){
		this.browse_graphic = browse_graphic;
	}
	public void setKeywords(List<String> keywords){
		this.keywords = keywords;
	}

}
