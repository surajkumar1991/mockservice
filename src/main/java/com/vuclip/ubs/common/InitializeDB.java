package com.vuclip.ubs.common;

import com.vuclip.ubs.utils.PaytmChecksumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class InitializeDB {

    /**
	 * Method to be invoked before launch of any Suite execution.
     */
    @BeforeSuite(alwaysRun = true)
    public final void init() {
         Logger logger = LogManager.getLogger(InitializeDB.class);
        Context.get().getCommonLogger().info("====== SettingUp Mock execution ======");
        FileInputStream inputStream = null;
        Properties properties = new Properties();
        try {
            logger.info(System.getProperty("user.dir"));
            String filepath =System.getProperty("user.dir").replaceAll("/target","/")+"src/main/resources/application.properties";

            logger.info(filepath);

            File configFile = new File(filepath);

            inputStream = new FileInputStream(configFile);
            properties.load(inputStream);


            Configuration.pldbServer = properties.getProperty("pldbServer");
            Configuration.pldbPort = properties.getProperty("pldbPort");
            Configuration.pldbName = properties.getProperty("pldbName");
            Configuration.pldbUser = properties.getProperty("pldbUser");
            Configuration.pldbPassword = properties.getProperty("pldbPassword");


            Context.get().getCommonLogger().info("Env set");
        } catch (Exception e) {
            Context.get().getCommonLogger().info("error setting up Mock execution" + e.getMessage());
            e.printStackTrace();

        }
    }

}
