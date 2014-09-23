package mdide.atomFeedGen;

import java.util.Properties;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;

import mdide.atomFeedGen.utils.ScheduleUtil;

import org.apache.log4j.Logger;
import org.quartz.SchedulerException;

/**
* Initialisierungsservlet, liest die Properties ein<br />
* und startet den initialen Generierungsprozess.
*
* @author Mathias Luecker, Michael Raeder
*/
public class Initialization extends HttpServlet{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 7550774056930736468L;
	static Logger log = Logger.getLogger(Initialization.class);

	public void init() throws ServletException {
		ServletContext context = getServletContext();
		Properties properties = new Properties();
		try{
			log.info("-------------------------------------------------------------------");
			log.info("Reading config.properties");
			  
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
			
			log.info("cswURL: "+properties.getProperty("cswURL"));
			log.info("proxyHost: "+properties.getProperty("proxyHost"));
			log.info("proxyPort: "+properties.getProperty("proxyPort"));
			log.info("feedURL: "+properties.getProperty("feedURL"));
			log.info("servicePath: "+properties.getProperty("servicePath"));
			log.info("dataSetPath: "+properties.getProperty("dataSetPath"));
			log.info("opensearchPath: "+properties.getProperty("opensearchPath"));
			log.info("serviceUUIDs: "+properties.getProperty("serviceUUIDs"));
			log.info("cronStart: "+properties.getProperty("cronStart"));
			log.info("key: "+properties.getProperty("key"));
			log.info("delay: "+properties.getProperty("startDelay"));
			log.info("-------------------------------------------------------------------");
			context.setAttribute("properties", properties);
		  }catch (Exception e){
			  log.error(e.toString(), e.fillInStackTrace());
		  }	
		
		int delay = Integer.parseInt(properties.getProperty("startDelay"))*1000;
		
		try {
		    Thread.sleep(delay);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		try{
			ScheduleUtil.startScheduledProcess(context);

	    	log.info("-------------------------------------------------------------------");
	    	log.info("Initiale Feed-Generierung:");
		}catch(SchedulerException e){
			log.error(e.toString(), e.fillInStackTrace());
		}
		
		try {
			@SuppressWarnings("unused")
			CronScheduler objPlugin = new CronScheduler(context);
		}catch (Exception e) {
			log.error(e.toString(), e.fillInStackTrace());
			e.printStackTrace();
		}
	}

}