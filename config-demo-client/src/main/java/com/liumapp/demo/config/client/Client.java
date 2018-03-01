package com.liumapp.demo.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 2/25/18 5:44 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Client {

    public static void main(String[] args) {
        SpringApplication.run(Client.class , args);
    }

}
