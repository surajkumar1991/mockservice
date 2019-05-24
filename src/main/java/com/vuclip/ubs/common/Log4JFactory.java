package com.vuclip.ubs.common;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Log4JFactory {

    /**
	 * Every time it is going to give new instance
     *
     * @param loggerName
     * @return
     */
    public static Logger getLogger(String loggerName) {
        Logger logger;

        logger = Logger.getLogger(loggerName);

        try {
            Properties logProperties = new Properties();
            logProperties.load(new FileInputStream("log4j.properties"));
            PropertyConfigurator.configure(logProperties);
            logger.debug("Logging initialized.");
        } catch (IOException e) {
            logger.debug("Unable to load logging property :", e);
        }

        return logger;
    }

}
