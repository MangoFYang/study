package com.yangfan.study.webservice.pojo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface PojoService {

	@WebMethod
	@WebResult(name="foo")
	Foo findFooById(@WebParam(name="id") String id);
	
	@WebMethod
	@WebResult(name="bar")
	Bar findBarById(@WebParam(name="id")String id);
	
}
