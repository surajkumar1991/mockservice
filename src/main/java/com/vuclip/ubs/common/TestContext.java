package com.vuclip.ubs.common;

import lombok.Getter;
import org.apache.log4j.Logger;

import java.util.HashMap;

@Getter
public class TestContext {

    final public static StringBuilder loggers = new StringBuilder();
    protected HashMap<String, HashMap<String, Object>> testBasedContextMap = new HashMap<String, HashMap<String, Object>>();
    protected HashMap<String, Object> contextMap = new HashMap<String, Object>();
    private Logger dbLogger;
    private Logger apiLogger;
    private Logger commonLogger;


    public TestContext() {
        dbLogger = Log4JFactory.getLogger("DB Logger");
        dbLogger = Log4JFactory.getLogger("DB Logger");
        apiLogger = Log4JFactory.getLogger("API Logger");
        commonLogger = Log4JFactory.getLogger("Automation Log");




    }

    public static StringBuilder getStringBuilder() {
        return loggers;
    }

    public Logger getDbLogger() {
        return dbLogger;
    }

    public void put(String testName, String key, Object value) throws IllegalArgumentException {
        if (testBasedContextMap.get(testName) == null) {
            HashMap<String, Object> newMap = new HashMap<>();
            newMap.put(key, value);
            testBasedContextMap.put(testName, newMap);

        } else {
            HashMap<String, Object> eMap = testBasedContextMap.get(testName);
            eMap.put(key, value);
            testBasedContextMap.put(testName, eMap);

        }

    }

    public void put(String testName, HashMap<String, Object> hMap) throws IllegalArgumentException {

        if (testBasedContextMap.get(testName) == null) {
            testBasedContextMap.put(testName, hMap);

        } else {
            HashMap<String, Object> eMap = testBasedContextMap.get(testName);

            for (String key : hMap.keySet()) {
                eMap.put(key, hMap.get(key));

            }
            testBasedContextMap.put(testName, eMap);
        }

    }

    @SuppressWarnings("unchecked")
    public <T> T get(String testName, String key) throws IllegalArgumentException {

        HashMap<String, Object> eMap = testBasedContextMap.get(testName);

        return (T) eMap.get(key);

    }

    public HashMap<String, Object> get(String testName) throws IllegalArgumentException {

        return testBasedContextMap.get(testName);

    }

    public void clear() {
        testBasedContextMap.clear();
    }

    public HashMap<String, HashMap<String, Object>> getContextMap() {
        return testBasedContextMap;
    }

    public void setContextMap(HashMap<String, HashMap<String, Object>> contextMap) {
        this.testBasedContextMap = contextMap;
    }

    @SuppressWarnings("unchecked")
    public <T> T getValue(String key) throws IllegalArgumentException {
        return (T) contextMap.get(key);

    }

    public void setValue(String key, Object value) throws IllegalArgumentException {
        if (contextMap == null) {
            contextMap = new HashMap<>();
        }

        contextMap.put(key, value);

    }

}