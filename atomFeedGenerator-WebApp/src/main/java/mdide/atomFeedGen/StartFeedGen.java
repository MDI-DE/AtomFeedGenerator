package mdide.atomFeedGen;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mdide.atomFeedGen.utils.ScheduleUtil;

import org.apache.log4j.Logger;
import org.quartz.SchedulerException;


/**
* Servlet zum manuellen Starten der AtomFeed Generierung<br />
*
* @author Mathias Luecker, Michael Raeder
*/
public class StartFeedGen extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(StartFeedGen.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartFeedGen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext(); 
		Properties properties = (Properties)context.getAttribute("properties");
		String key = request.getParameter("key");
    	PrintWriter writer = response.getWriter();
    	writer.println("<html>");
    	writer.println("<head><title>Start der Feed Generierung</title></head>");
    	writer.println("<body>");
		if(key.equals(properties.getProperty("key"))){
			try{
				ScheduleUtil.startScheduledProcess(context);

		    	writer.println("<h1>Generierung gestartet!</h1>");
		    	log.info("-------------------------------------------------------------------");
		    	log.info("Manuelle Feed-Generierung:");
			}catch(SchedulerException e){
				writer.println("<h1>Fehler beim Start der Generierung!</h1>");
				log.error(e.toString(), e.fillInStackTrace());
			}
		}else{
			writer.println("<h1>Sicherheitsschluessel als \"key\"-Parameter angeben!</h1>");
		}
    	writer.println("<body>");
    	writer.println("</html>");
    	writer.close();	
	}

}
