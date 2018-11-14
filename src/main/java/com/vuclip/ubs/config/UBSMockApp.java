package com.vuclip.ubs.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.vuclip.ubs.*"})
@ComponentScan(basePackages = "com.vuclip.ubs.*")
@EnableAutoConfiguration
public class UBSMockApp {

    public static void main(String[] args) {
        SpringApplication.run(UBSMockApp.class, args);

    }

}
