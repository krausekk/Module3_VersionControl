package module3_Java;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class MyHandler extends module3_logging {
	
	private static final Logger logger = Logger.getLogger(module3_logging.class.getName());
	
	public static void main(String[] args) {
		
		Handler consoleHandler = null;
    Handler fileHandler  = null;
    try{
        //Creating consoleHandler and fileHandler
        consoleHandler = new ConsoleHandler();
        fileHandler  = new FileHandler("/Users/kksab/tmp/handler.log");
         
        //Assigning handlers to LOGGER object
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);
         
        //Setting levels to handlers and LOGGER
        consoleHandler.setLevel(Level.ALL);
        fileHandler.setLevel(Level.ALL);
        logger.setLevel(Level.ALL);
         
        logger.config("Configuration completed.");
         
        //Console handler removed
        logger.removeHandler(consoleHandler);
         
        logger.log(Level.FINE, "Finer logged");
    }catch(IOException exception){
    	logger.log(Level.SEVERE, "Error occur in FileHandler.", exception);
    }
     
    logger.finer("Finest example on LOGGER handler completed.");
     
}

}