package com.yangfan.study.webservice.helloworld;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWorldService.class);
		factory.setAddress("http://localhost:8080/study-webservice/services/HelloWorldService");
		HelloWorldService helloworld = (HelloWorldService) factory.create();
		System.out.println(helloworld.sayHi("kongxx"));
		System.exit(0);
	}

}
