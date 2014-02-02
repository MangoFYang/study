package com.yangfan.study.webservice.pojo;

import com.yangfan.study.webservice.util.WSUtils;

public class Client {

	public static void main(String[] args) {
		/*
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PojoService.class);
		factory.setAddress("http://localhost:8080/study-webservice/services/PojoService");
		PojoService pojoService = (PojoService) factory.create();
		*/
		// Foo findFooById = pojoService.findFooById("foo");
		// System.out.println(findFooById);
		
		PojoService pojoService = WSUtils.getInstance(
				PojoService.class, 
				"http://localhost:8080/study-webservice/services/PojoService");
		
		long s2 = System.currentTimeMillis();
		Bar findBarById = pojoService.findBarById("bar");
		System.out.println(findBarById);
		System.out.println("s2用时: " + (System.currentTimeMillis() - s2));

		long s1 = System.currentTimeMillis();
		Foo findFooById = pojoService.findFooById("foo");
		System.out.println(findFooById);
		System.out.println("s1用时: " + (System.currentTimeMillis() - s1));
		
		System.exit(0);
	}

}
