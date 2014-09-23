package mdide.model;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Gesammelte Methoden zur DB-Abfrage
 * 
 * @author Mathias Luecker, Michael Raeder
 *
 */
public class JPAManager {
	static Logger log = Logger.getLogger(JPAManager.class);
	
	/**
	 * Speichert einen Dataset-Datensatz in der DB
	 * 
	 * @param uuid
	 * @param crs
	 * @param title
	 * @param datalink
	 * @param lang
	 * @param namespace
	 * @param type
	 * @param description
	 * @param serviceId
	 * @param rights
	 * @param organisation
	 * @param browseGraphic
	 * @param bbox
	 */
	public static void addDataset(String uuid, String crs, String title, String datalink, String lang, String namespace, String type, String description,String serviceId, String rights,String organisation, String browseGraphic, String bbox) {
		 
		Transaction trns1 = null;
		Session session1 = HibernateUtil.getSessionFactory().openSession();
		trns1 = session1.beginTransaction();
		try{
			 
			@SuppressWarnings("unchecked")
			List<Dataset> datasets = session1.createQuery("from Dataset as d where d.uuid = :uuid").setString( "uuid", uuid ).list();
			for(int i = 0; i < datasets.size(); i++){
				String crsTemp = datasets.get(i).getCrs();
				String typeTemp = datasets.get(i).getType();
				String uuidTemp = datasets.get(i).getUuid();
				int idTemp = datasets.get(i).getId();
				if(crsTemp.equals(crs) && typeTemp.equals(type) && uuidTemp.equals(uuid)){
					session1.createQuery("delete from Dataset where DATASET_ID= :id").setInteger("id", idTemp).executeUpdate();
				}
			}
			session1.getTransaction().commit();
		}catch(Exception e){
			 if(trns1 != null){
				 trns1.rollback();
			 }
			 e.printStackTrace();
		 }finally{
			 session1.flush();
			 session1.close();
		 }
		 Transaction trns2 = null;
		 Session session2 = HibernateUtil.getSessionFactory().openSession();
		 trns2 = session2.beginTransaction();
		 
		 try {
	    
			 Dataset dataset = new Dataset();
	    
			 dataset.setCrs(crs);
			 dataset.setDatalink(datalink);
			 dataset.setLanguage(lang);
			 dataset.setNamespace(namespace);
			 dataset.setTitle(title);
			 dataset.setType(type);
			 dataset.setUuid(uuid);
			 dataset.setDescription(description);
			 dataset.setServiceId(serviceId);
			 dataset.setRights(rights);
			 dataset.setOrganisation(organisation);
			 dataset.setBrowseGraphic(browseGraphic);
			 dataset.setBbox(bbox);
			 session2.save(dataset);
	    
			 session2.getTransaction().commit();
		 } catch (Exception e) {
			 if(trns2 != null){
				 trns2.rollback();
			 }
			 log.error(e.toString(), e.fillInStackTrace());
			 e.printStackTrace();
		 } finally{
			 session2.flush();
			 session2.close();
		 }
	 }
	 
	/**
	 * Speichert einen Service-Datensatz in der DB
	 * 
	 * @param title
	 * @param uuid
	 * @param browseGraphic
	 */
	 public static void addService(String title, String uuid, String browseGraphic) {
		 Transaction trns1 = null;
		 Session session1 = HibernateUtil.getSessionFactory().openSession();
		 trns1 = session1.beginTransaction();
		 try{
			 @SuppressWarnings("unchecked")
			 List<Service> services = session1.createQuery("from Service as d where d.uuid = :uuid").setString( "uuid", uuid ).list();
	
			 for(int i = 0; i < services.size(); i++){
				 String uuidTemp = services.get(i).getUuid();
				 if(uuidTemp.equals(uuid)){
					 session1.createQuery("delete from Service as d where d.uuid = :uuid").setString("uuid", uuid).executeUpdate();
				 }
			 }
			 session1.getTransaction().commit();
		 }catch(Exception e){
			 if(trns1 != null){
				 trns1.rollback();
			 }
			 log.error(e.toString(), e.fillInStackTrace());
			 e.printStackTrace();
		 }finally{
			 session1.flush();
			 session1.close();
		 }
		 
		 Transaction trns2 = null;
		 Session session2 = HibernateUtil.getSessionFactory().openSession();
		 trns2 = session2.beginTransaction();
		 try {
			     
			 Service service = new Service();
			 service.setUuid(uuid);
			 service.setTitle(title);
			 service.setBrowseGraphic(browseGraphic);
			 session2.save(service);
	    
			 session2.getTransaction().commit();
		 } catch (Exception e) {
			 if(trns2 != null){
				 trns2.rollback();
			 }
			 log.error(e.toString(), e.fillInStackTrace());
			 e.printStackTrace();
		 } finally{
			 session2.flush();
			 session2.close();
		 }
	 }
	 
	 /**
	  * Rufr alle Dataset-Datensaetze mit einer bestimmten serviceId ab.
	  * 
	  * @param serviceId
	  * @return
	  */
	 @SuppressWarnings("unchecked")
	 public static List<Dataset> getDataSetsByServiceId(String serviceId){
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 
		List<Dataset> datasets = session.createQuery("from Dataset as d where d.serviceId = :serviceId").setString( "serviceId", serviceId ).list();
		 session.close();
		 return datasets;
	 }
	 
	 /**
	  * Ruft alle Dataset-Datensaetze aus der DB ab.
	  * 
	  * @return
	  */
	 @SuppressWarnings("unchecked")
	 public static List<Dataset> getDataSets(){
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 List<Dataset> datasets = session.createQuery("from Dataset").list();
		 session.close();
		 return datasets;
	 }
	 
	 /**
	  * Rufr alle Service-Datensaetze aus der DB ab.
	  * 
	  * @return
	  */
	 @SuppressWarnings("unchecked")
	 public static List<Service> getServices(){
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 List<Service> services = session.createQuery("from Service").list();
		 session.close();
		 return services;
	 }
	 
	 /**
	  * Ruft alle Dataset-Datensaetze mit einer bestimmten UUID ab.
	  * 
	  * @param uuid
	  * @return
	  */
	 @SuppressWarnings("unchecked")
	 public static List<Dataset> getDataSetsByUUID(String uuid){
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 List<Dataset> datasets = session.createQuery("from Dataset as d where d.uuid = :uuid").setString( "uuid", uuid ).list();
		 session.close();
		 return datasets;	
	 }
}
