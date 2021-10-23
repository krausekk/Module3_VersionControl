package module3_Java;

import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyFormatter extends module3_logging {
 
private static final Logger logger = Logger.getLogger(module3_logging.class.getName());
    
    public static void main(String[] args) {
 
        Handler fileHandler = null;
        Formatter simpleFormatter = null;
        try{
             
            // Creating FileHandler
            fileHandler = new FileHandler("/Users/kksab/tmp/formatter.log");
             
            // Creating SimpleFormatter
            simpleFormatter = new SimpleFormatter();
             
            // Assigning handler to logger
            logger.addHandler(fileHandler);
             
            // Logging message of Level info (this should be publish in the default format i.e. XMLFormat)
            logger.info("Finnest message: Logger with DEFAULT FORMATTER");
             
            // Setting formatter to the handler
            fileHandler.setFormatter(simpleFormatter);
             
            // Setting Level to ALL
            fileHandler.setLevel(Level.ALL);
            logger.setLevel(Level.ALL);
             
            // Logging message of Level finest (this should be publish in the simple format)
            logger.finest("Finnest message: Logger with SIMPLE FORMATTER");
        }catch(IOException exception){
        	logger.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
    }
}