package org.example.smartscheduler;

// Required imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * This is the main entry point for the Spring boot application
 * It enables scheduling and seeds initial data on startup.
 * */
@SpringBootApplication // Combines @EnableAutoConfiguration, @ComponentScan and @SpringBootConfiguration
@EnableScheduling  // Enables support of @Scheduled annotation on specified methods
public class SmartSchedulerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartSchedulerApplication.class, args);
    }



}
