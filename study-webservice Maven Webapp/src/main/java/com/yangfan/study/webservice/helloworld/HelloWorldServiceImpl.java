package com.yangfan.study.webservice.helloworld;

import javax.jws.WebService;

@WebService(endpointInterface="com.yangfan.study.webservice.helloworld.HelloWorldService", serviceName="HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String sayHi(String name) {
		System.out.println("sayHi called");
		return "Hello " + name;
	}

}
