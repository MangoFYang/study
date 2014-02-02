package com.yangfan.study.webservice.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public final class Client4Spring {

    public static void main(String args[]) throws Exception {
    	
        ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext(new String[] {"applicationContext-client.xml"});

        HelloWorldService client = context.getBean(HelloWorldService.class);

        String response = client.sayHi("Joe");
        System.out.println("Response: " + response);
        System.exit(0);
        
    }
}
