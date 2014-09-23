package mdide.atomFeedGen.utils;

import javax.servlet.ServletContext;

import mdide.atomFeedGen.AtomFeedGenerator;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Startet einen Job zur AtomFeed Generierung
 * 
 * @author Mathias Luecker
 *
 */
public class ScheduleUtil {
	
	public static void startScheduledProcess(ServletContext context) throws SchedulerException{
		
		JobKey jobKey = JobKey.jobKey("GenerateAtomFeed", "AtomFeed");
		JobDetail job = JobBuilder.newJob(AtomFeedGenerator.class).withIdentity(jobKey).storeDurably().build();
    	job.getJobDataMap().put("servletContext", context);
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.start();
    	scheduler.addJob(job, true);
    	scheduler.triggerJob(jobKey);
		
	}

}
