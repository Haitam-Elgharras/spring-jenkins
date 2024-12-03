package com.jenkins.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
//    add a logger
    private static final Logger LOG = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    // add a post-construct method
    @PostConstruct
    public void init(){
        LOG.info("Application started...");
    }

    public static void main(String[] args) {
        LOG.info("Application executed...");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
