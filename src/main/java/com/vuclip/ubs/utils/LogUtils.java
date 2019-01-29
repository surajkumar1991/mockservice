package com.vuclip.ubs.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class LogUtils {
    private Logger logger = LogManager.getLogger(LogUtils.class);

    public void logHeader(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            logger.info("header name " + headerName);
            Enumeration<String> headers = request.getHeaders(headerName);
            while (headers.hasMoreElements()) {
                String headerValue = headers.nextElement();
                logger.info(headerValue);
            }
        }
    }

    public void logParamsAndBody(HttpServletRequest request) {
        Map<String, String[]> parameters = request.getParameterMap();
        for (String key : parameters.keySet()) {
            logger.info("Key " + key);
            for (String value : parameters.get(key)) {
                logger.info("Value " + value);
            }
        }

        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = request.getReader();
        } catch (IOException e) {
            logger.info(e);
        }

        if (reader != null) {
            try {
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append('\n');
                }
            } catch (IOException e) {
                logger.info(e);
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    logger.info(e);
                }
            }
            logger.info(sb.toString());
        }
    }

}
