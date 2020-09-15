package com.mayikt.api.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AppOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppOrder.class, args);
	}
	
	/**
	 * 解决RestTemplate找不到问题 应该把RestTemplate注入到springboot容器中
	 * 如果要使用RestTemplate以别名方式调用,必须采用@LoadBalanced注解
	 * @LoadBalanced就能让这个RestTemplate在请求时拥有客户端负载均衡的能力(ribbon)
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
