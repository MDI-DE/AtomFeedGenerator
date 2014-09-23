package mdide.atomFeedGen.utils;

import java.util.List;

/**
* Speichert die XML-Daten zu einem Datensatz-Metadatum<br />
*
* @author Mathias Luecker, Michael Raeder
*/
public class DatasetElements {
	
	private String id;
	private String codeUUID;
	private String title;
	private String desc;
	private String dateStamp;
	private String rights;
	private String authorName;
	private String organisationName;
	private String authorMail;
	private String bboxwest;
	private String bboxeast;
	private String bboxsouth;
	private String bboxnorth;
	private String type;
	private String language;
	private String browseGraphic;
	private  List<String> urlList;
	private  List<String> descriptionList;
	private  List<String> codeListValueList;
	private  List<String> nameValueList;
	private  List<String> appProfileValueList;
	
	public DatasetElements(){
	}

	public String getTitle(){
		return this.title;
	}
	public String getDesc(){
		return this.desc;
	}
	public String getCodeUUID(){
		return this.codeUUID;
	}
	public String getId(){
		return this.id;
	}
	public String getRights(){
		return this.rights;
	}
	public String getDateStamp(){
		return this.dateStamp;
	}
	public String getBBOX(){
		return this.bboxsouth+" "+this.bboxwest+" "+this.bboxnorth+" "+this.bboxeast;
	}
	public String getBBOXsouth(){
		return this.bboxsouth;
	}
	public String getBBOXwest(){
		return this.bboxwest;
	}
	public String getBBOXnorth(){
		return this.bboxnorth;
	}
	public String getBBOXeast(){
		return this.bboxeast;
	}
	public String getLanguage(){
		return this.language;
	}
	public String getAuthorName(){
		return this.authorName;
	}
	public String getAuthorMail(){
		return this.authorMail;
	}
	public List<String> getDescriptionList(){
		return this.descriptionList;
	}
	public List<String> getURLList(){
		return this.urlList;
	}
	public List<String> getCodeListValueList(){
		return this.codeListValueList;
	}
	public List<String> getNameList(){
		return this.nameValueList;
	}
	public List<String> getAppProfileList(){
		return this.appProfileValueList;
	}
	public String getType(){
		return this.type;
	}
	public String getOrganisationName(){
		return this.organisationName;
	}
	public String getBrowseGraphic(){
		return this.browseGraphic;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	public void setDesc(String desc){
		this.desc=desc;
	}
	public void setCodeUUID(String codeUUID){
		this.codeUUID=codeUUID;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setRights(String rights){
		this.rights=rights;
	}
	public void setDateStamp(String dateStamp){
		this.dateStamp=dateStamp;
	}
	public void setBBOXsouth(String bboxsouth){
		this.bboxsouth=bboxsouth;
	}
	public void setBBOXeast(String bboxeast){
		this.bboxeast=bboxeast;
	}
	public void setBBOXnorth(String bboxnorth){
		this.bboxnorth=bboxnorth;
	}
	public void setBBOXwest(String bboxwest){
		this.bboxwest=bboxwest;
	}
	public void setLanguage(String language){
		this.language=language;
	}
	public void setAuthorName(String authorName){
		this.authorName=authorName;
	}
	public void setAuthorMail(String authorMail){
		this.authorMail=authorMail;
	}
	public void setType(String type){
		this.type=type;
	}
	public void setOrganisationName(String organisationName){
		this.organisationName=organisationName;
	}
	public void setBrowseGraphic(String browseGraphic){
		this.browseGraphic=browseGraphic;
	}
	
	public void setDescriptionList(List<String> descriptionList){
		this.descriptionList=descriptionList;
	}
	public void setURLList(List<String> urlList){
		this.urlList=urlList;
	}
	public void setCodeListValueList(List<String> codeListValueList){
		this.codeListValueList=codeListValueList;
	}
	public void setNameList(List<String> nameValueList){
		this.nameValueList=nameValueList;
	}
	public void setAppProfileList(List<String> appProfileValueList){
		this.appProfileValueList=appProfileValueList;
	}
}

