package mdide.atomFeedGen;

import java.util.Properties;

import javax.servlet.ServletContext;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
* Startet die AtomFeed Generierung am definierten Zeitpunkt<br />
*
* @author Mathias Luecker, Michael Raeder
*/
public class CronScheduler {
	
    public CronScheduler(ServletContext context) throws Exception {
    	JobDetail job = JobBuilder.newJob(AtomFeedGenerator.class).withIdentity("GenerateAtomFeedCron", "AtomFeed").build();
    	job.getJobDataMap().put("servletContext", context);
    	
    	Properties properties = (Properties)context.getAttribute("properties");
    	
    	Trigger trigger = TriggerBuilder.newTrigger().withIdentity("GenerateAtomFeedTrigger", "AtomFeed").withSchedule(CronScheduleBuilder.cronSchedule(properties.getProperty("cronStart"))).build();
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.start();
    	scheduler.scheduleJob(job, trigger);
    }
}
