package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启Eureka服务(注册中心)
@EnableEurekaServer
public class AppEureka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppEureka.class, args);
	}

}
