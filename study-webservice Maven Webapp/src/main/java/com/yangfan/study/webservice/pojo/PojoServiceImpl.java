package com.yangfan.study.webservice.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService
public class PojoServiceImpl implements PojoService {

	@Override
	public Foo findFooById(String id) {
		Foo foo = new Foo();
		foo.setDoubleField(1.01);
		foo.setBigDecimalField(new BigDecimal("1111.111"));
		foo.setDateField(new Date());
		foo.setDoubleBoxField(1.001);
		foo.setId("sid");
		foo.setIntegerField(10);
		foo.setIntField(12);
		foo.setStringField("str");
		return foo;
	}

	@Override
	public Bar findBarById(String id) {
		
		List<Date> dateListField = new ArrayList<Date>();
		dateListField.add(new Date());
		
		List<Foo> fooListField = new ArrayList<Foo>();
		Foo foo = new Foo();
		foo.setDoubleField(1.01);
		foo.setBigDecimalField(new BigDecimal("1111.111"));
		foo.setDateField(new Date());
		foo.setDoubleBoxField(1.001);
		foo.setId("sid");
		foo.setIntegerField(10);
		foo.setIntField(12);
		foo.setStringField("str");
		fooListField.add(foo);
		
		Map<String, Foo> stringFooMap = new HashMap<String, Foo>();
		stringFooMap.put("foo", foo);
		
		List<String> stringListField = new ArrayList<String>();
		stringListField.add("stringListField");
		
		Map<String, String> stringStringMap = new HashMap<String, String>();
		stringStringMap.put("key1", "value1");
		
		Bar bar = new Bar();
		bar.setFoo(foo);
		bar.setDateListField(dateListField);
		bar.setFooListField(fooListField);
		bar.setStringFooMap(stringFooMap);
		bar.setStringListField(stringListField);
		bar.setStringStringMap(stringStringMap);
		return bar;
	}

}
