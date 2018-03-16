package com.yapan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Sun
 * @create 2018-03-16 17:27
 * @desc 注册中心
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eurekaserver{

    public static void main(String[] args) {
        SpringApplication.run(Eurekaserver.class, args);
    }

}
