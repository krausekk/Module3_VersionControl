package module3_Java;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
 
// Extending module3_logging class to MyHandler
public class MyHandler extends module3_logging {
	
	private static final Logger logger = Logger.getLogger(module3_logging.class.getName());
	
	public static void main(String[] args) {
		// Console Handler
		Handler cH = null;
		
		//FileHandler
		Handler fH  = null;
    try{
        //Creating consoleHandler and fileHandler
        cH = new ConsoleHandler();
        fH  = new FileHandler("/Users/kksab/tmp/handler.log");
         
        //Assigning handlers to LOGGER object
        logger.addHandler(cH);
        logger.addHandler(fH);
         
        //Setting levels to handlers and LOGGER
        cH.setLevel(Level.FINEST);
        fH.setLevel(Level.FINEST);
        logger.setLevel(Level.FINEST);
         
        logger.config("Configuration has been completed.");
         
        //Console handler removed
        logger.removeHandler(cH);
         
        logger.log(Level.FINE, "Finer logged");
    }catch(IOException exception){
    	logger.log(Level.SEVERE, "Error occur in FileHandler.", exception);
    }
     
    logger.finer("Finest example on LOGGER handler completed.");
     
}

}