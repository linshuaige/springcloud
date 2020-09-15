package com.mayikt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderApiController {

	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 采用
	 * @return
	 */
	@RequestMapping("/getOrder")
	public String getOrder() {
		/*直接使用地址调用
		String result = restTemplate.getForObject("http://127.0.0.1:8000/getMember", String.class);*/
		//使用别名进行本地负载均衡调用
		String url = "http://app-itmayiedu-member/getMember";
		String result = restTemplate.getForObject(url, String.class);
		System.out.println("result:"+result);
		return result;
	}
	

}
