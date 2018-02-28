package com.liumapp.demo.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by liumapp on 2/25/18 1:20 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class Server {

    public static void main(String[] args) {
        SpringApplication.run(Server.class , args);
    }

}
