package module3_Java;

import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// extending module3_logging class to MyFormatter
public class MyFormatter extends module3_logging {
 
private static final Logger logger = Logger.getLogger(module3_logging.class.getName());
    
    public static void main(String[] args) {
 
        Handler fH = null;
        Formatter formatter = null;
        try{
             
            // Creating FileHandler
            fH = new FileHandler("/Users/kksab/tmp/formatter.log");
             
            // Creating SimpleFormatter
            formatter = new SimpleFormatter();
             
            // Assigning handler to logger
            logger.addHandler(fH);
             
            // Logging message of Level info (this should be publish in the default format i.e. XMLFormat)
            logger.info("INFO message using the formatter");
             
            // Setting formatter to the handler
            fH.setFormatter(formatter);
             
            // Setting Level to INFO
            fH.setLevel(Level.INFO);
            logger.setLevel(Level.INFO);
             
            // Logging message of Level finest (this should be publish in the simple format)
            logger.finest("Finest message: Logger with SIMPLE FORMATTER");
        }catch(IOException exception){
        	logger.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
    }
}