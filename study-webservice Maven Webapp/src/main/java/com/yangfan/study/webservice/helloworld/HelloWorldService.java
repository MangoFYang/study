package com.yangfan.study.webservice.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorldService {
	
	@WebMethod
	@WebResult(name="ret")
	String sayHi(@WebParam(name="name") String name);  
	

}
