package com.yangfan.study.webservice.helloworld;

import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) throws Exception {
		HelloWorldService implementor = new HelloWorldServiceImpl();
		String address = "http://localhost:8080/study-webservice/services/HelloWorldService";
		Endpoint.publish(address, implementor);

		System.out.println("Server start...");
		Thread.sleep(60 * 1000);
		System.out.println("Server exit...");
		System.exit(0);
	}

}
