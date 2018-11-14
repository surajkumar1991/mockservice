package com.vuclip.ubs.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationServiceControllers {
    private Logger logger = LogManager.getLogger(ConfigurationServiceControllers.class);

    @RequestMapping(value = "/saveCountry", method = {RequestMethod.POST, RequestMethod.PUT,
            RequestMethod.DELETE}, consumes = "application/json")
    public ResponseEntity<String> saveCountry(@RequestBody String json) {
        logger.info("REQUEST RECEIVED JSON " + json);
        return new ResponseEntity<String>("{\"status\":\"SUCCESS\"}", HttpStatus.OK);
    }

    @RequestMapping(value = "/saveProduct", method = {RequestMethod.POST, RequestMethod.PUT,
            RequestMethod.DELETE}, consumes = "application/json")
    public ResponseEntity<String> saveProduct(@RequestBody String json) {
        logger.info("REQUEST RECEIVED JSON " + json);

        return new ResponseEntity<String>("{\"status\":\"SUCCESS\"}", HttpStatus.OK);
    }

    @RequestMapping(value = "/savePartner", method = {RequestMethod.POST, RequestMethod.PUT,
            RequestMethod.DELETE}, consumes = "application/json")
    public ResponseEntity<String> savePartner(@RequestBody String json) {
        logger.info("REQUEST RECEIVED JSON " + json);

        return new ResponseEntity<String>("{\"status\":\"SUCCESS\"}", HttpStatus.OK);
    }

    @RequestMapping(value = "/saveAdNetwork", method = {RequestMethod.POST, RequestMethod.PUT,
            RequestMethod.DELETE}, consumes = "application/json")
    public ResponseEntity<String> saveAdNetwork(@RequestBody String json) {
        logger.info("REQUEST RECEIVED JSON " + json);
        return new ResponseEntity<String>("{\"status\":\"SUCCESS\"}", HttpStatus.OK);
    }

}
