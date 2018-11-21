package com.vuclip.ubs.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdNetworkServiceControllers {
    private Logger logger = LogManager.getLogger(AdNetworkServiceControllers.class);

    @RequestMapping(value = "/conversion/{volumtid}/pixel.jpg", method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseEntity<String> conversionPost(@PathVariable String volumtid) {
        logger.info("ANS: GOT  REQUEST" + volumtid);

        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }

}
