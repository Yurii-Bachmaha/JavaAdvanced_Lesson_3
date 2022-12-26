package task01;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {

	private static final Logger LOG = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		
		DOMConfigurator.configure("loggerConfig.xml");
		LOG.trace("TRACE");
		LOG.debug("DEBUG");
		LOG.info("INFO");
		LOG.warn("WARN");
		LOG.error("ERROR");
		LOG.fatal("FATAL");
	}
}