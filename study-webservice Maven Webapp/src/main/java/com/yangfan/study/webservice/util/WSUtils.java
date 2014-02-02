package com.yangfan.study.webservice.util;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WSUtils {

	@SuppressWarnings("unchecked")
	public static <T> T getInstance(Class<T> clazz, String address) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(clazz);
		factory.setAddress(address);
		T t =  (T) factory.create();
		return t;
	}
	
}
