package com.vuclip.ubs.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vuclip.ubs.models.veniso.VenisoHashRequestVO;
import com.vuclip.ubs.utils.VenisoHashUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class VenisoHashController {

    private static ObjectMapper objectMapper = new ObjectMapper();
    String venisoSecretKey = "vuclip12vuclip12";
    private Logger logger = LogManager.getLogger(VenisoHashController.class);

    @RequestMapping(value = "/veniso/encrypt", method = {RequestMethod.POST})
    public ResponseEntity<String> getHash(@RequestBody VenisoHashRequestVO requestBody) {

        logger.info("Fetching params from Request and creating Map for processing");

        StringBuilder hashMessageString = new StringBuilder();

        logger.info("HASH Request Body : " + requestBody);

        LinkedHashMap<String, String> paramMap = objectMapper.convertValue(requestBody, new TypeReference<Map<String, String>>() {
        });

        while (paramMap.values().remove(null)) ;

        paramMap.forEach((consentKey, consentValue) -> hashMessageString.append(consentValue).append("|"));

        logger.info("MAP String : " + hashMessageString.toString());

        String hashValue = VenisoHashUtils.encrypt(venisoSecretKey, hashMessageString.toString());

        logger.info("Hash Value : " + hashValue);


        return new ResponseEntity<String>(hashValue, HttpStatus.OK);

    }

    @RequestMapping(value = "/veniso/decrypt", method = {RequestMethod.GET})
    public ResponseEntity<String> decryptHash(@RequestParam("hash") String requestBody) {

        logger.info("Fetching params from Request and creating Map for processing");
        try {
            requestBody = URLEncoder.encode(requestBody, StandardCharsets.UTF_8.name());

            System.out.println(URLEncoder.encode(requestBody, StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        logger.info("Request Hash Parameter : " + requestBody);

        String hash = VenisoHashUtils.decrypt(venisoSecretKey, requestBody);


        return new ResponseEntity<String>(hash, HttpStatus.OK);

    }
}
