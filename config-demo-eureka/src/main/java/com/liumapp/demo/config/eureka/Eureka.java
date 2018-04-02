package com.liumapp.demo.config.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by liumapp on 3/1/18 10:44 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class , args);
    }

}
