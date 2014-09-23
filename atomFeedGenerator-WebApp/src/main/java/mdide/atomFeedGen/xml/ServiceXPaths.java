package mdide.atomFeedGen.xml;

/**
 * Stellt XPaths bereit, um Elemente aus den Dienst-Metadaten zu extrahieren
 * 
 * @author Mathias Luecker, Michael Raeder
 *
 */
public class ServiceXPaths extends AbstractXPaths{
	
	public static String TITEL = "/*/*/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:citation/gmd:CI_Citation/gmd:title/gco:CharacterString";
	public static String DESC = "/*/*/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:abstract/gco:CharacterString";
	public static String DATE_STAMP = "/*/*/gmd:dateStamp/*";
	public static String RIGHTS = "/*/*/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:resourceConstraints/gmd:MD_LegalConstraints/gmd:useLimitation/gco:CharacterString";
	public static String LANGUAGE = "/*/*/gmd:language/gmd:LanguageCode";
	public static String AUTHOR_NAME = "/*/*/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:pointOfContact/gmd:CI_ResponsibleParty/gmd:individualName/gco:CharacterString";
	public static String AUTHOR_MAIL = "/*/*/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:pointOfContact/gmd:CI_ResponsibleParty/gmd:contactInfo/gmd:CI_Contact/gmd:address/gmd:CI_Address/gmd:electronicMailAddress/gco:CharacterString";
	public static String ORG_NAME = "/*/*/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:pointOfContact/gmd:CI_ResponsibleParty/gmd:organisationName/gco:CharacterString";
	public static String BROWSE_GRAPHIC = "/*/gmd:MD_Metadata/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:graphicOverview/gmd:MD_BrowseGraphic/gmd:fileName/gco:CharacterString";
	public static String KEYWORDS = "/*/gmd:MD_Metadata/gmd:identificationInfo/srv:SV_ServiceIdentification/gmd:descriptiveKeywords/gmd:MD_Keywords/gmd:keyword/gco:CharacterString";
	public static String OPERATES_ON = "/*/gmd:MD_Metadata/gmd:identificationInfo/srv:SV_ServiceIdentification/srv:operatesOn/@uuidref";
	
}
