package mdide.atomFeedGen.xml;



/**
 * Stellt XPaths bereit, um Elemente aus den Datensatz-Metadaten zu extrahieren
 * 
 * @author Mathias Luecker, Michael Raeder
 *
 */
public class DatasetXPaths extends AbstractXPaths{
	
	public static String UUID = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:citation/gmd:CI_Citation/gmd:identifier/gmd:MD_Identifier/gmd:code/gco:CharacterString";
	public static String FILE_ID = "/*/*/gmd:fileIdentifier/gco:CharacterString";
	public static String TITLE = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:citation/gmd:CI_Citation/gmd:title/gco:CharacterString";
	public static String DESC = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:abstract/gco:CharacterString";
	public static String DATE_STAMP = "/*/*/gmd:dateStamp/*";
	public static String RIGHTS = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:resourceConstraints/gmd:MD_LegalConstraints/gmd:useLimitation/gco:CharacterString";
	public static String AUTHOR_NAME = "/*/*/gmd:contact/gmd:CI_ResponsibleParty/gmd:individualName/gco:CharacterString";
	public static String AUTHOR_MAIL = "/*/*/gmd:contact/gmd:CI_ResponsibleParty/gmd:contactInfo/gmd:CI_Contact/gmd:address/gmd:CI_Address/gmd:electronicMailAddress/gco:CharacterString";
	public static String ORG_NAME = "/*/*/gmd:contact/gmd:CI_ResponsibleParty/gmd:organisationName/gco:CharacterString"; 
	public static String BBOX_WEST = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:extent/gmd:EX_Extent/gmd:geographicElement/gmd:EX_GeographicBoundingBox/gmd:westBoundLongitude/gco:Decimal";
	public static String BBOX_EAST = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:extent/gmd:EX_Extent/gmd:geographicElement/gmd:EX_GeographicBoundingBox/gmd:eastBoundLongitude/gco:Decimal";
	public static String BBOX_SOUTH = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:extent/gmd:EX_Extent/gmd:geographicElement/gmd:EX_GeographicBoundingBox/gmd:southBoundLatitude/gco:Decimal";
	public static String BBOX_NORTH = "/*/*/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:extent/gmd:EX_Extent/gmd:geographicElement/gmd:EX_GeographicBoundingBox/gmd:northBoundLatitude/gco:Decimal";
	public static String TYPE = "/*/*/gmd:hierarchyLevel/gmd:MD_ScopeCode/@codeListValue";
	public static String LANGUAGE = "/*/*/gmd:language/gmd:LanguageCode";
	public static String BROWSE_GRAPHIC = "/*/gmd:MD_Metadata/gmd:identificationInfo/gmd:MD_DataIdentification/gmd:graphicOverview/gmd:MD_BrowseGraphic/gmd:fileName/gco:CharacterString";
	public static String ONLINE_RESSOURCE_URL = "/*/gmd:MD_Metadata/gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource/gmd:linkage/gmd:URL";
	public static String ONLINE_RESSOURCE_DESC = "/*/gmd:MD_Metadata/gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource/gmd:description/gco:CharacterString";
	public static String ONLINE_RESSOURCE_CODE = "/*/gmd:MD_Metadata/gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource/gmd:function/gmd:CI_OnLineFunctionCode/@codeListValue";
	public static String ONLINE_RESSOURCE_PROTOCOL = "/*/gmd:MD_Metadata/gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource/gmd:protocol/gco:CharacterString";
	public static String ONLINE_RESSOURCE_PROFILE = "/*/gmd:MD_Metadata/gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource/gmd:applicationProfile/gco:CharacterString";
	public static String ONLINE_RESSOURCE_NAME = "/*/gmd:MD_Metadata/gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource/gmd:name/gco:CharacterString";
	public static String ONLINE_RESSOURCE = "/*/gmd:MD_Metadata/gmd:distributionInfo/gmd:MD_Distribution/gmd:transferOptions/gmd:MD_DigitalTransferOptions/gmd:onLine/gmd:CI_OnlineResource";
	
	public static String ONLINE_RESSOURCE_URL_SUB = "gmd:linkage/gmd:URL";
	public static String ONLINE_RESSOURCE_DESC_SUB = "gmd:description/gco:CharacterString";
	public static String ONLINE_RESSOURCE_CODE_SUB = "gmd:function/gmd:CI_OnLineFunctionCode/@codeListValue";
	public static String ONLINE_RESSOURCE_PROTOCOL_SUB = "gmd:protocol/gco:CharacterString";
	public static String ONLINE_RESSOURCE_PROFILE_SUB = "gmd:applicationProfile/gco:CharacterString";
	public static String ONLINE_RESSOURCE_NAME_SUB = "gmd:name/gco:CharacterString";

}
