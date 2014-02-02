package com.yangfan.study.webservice.pojo;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Bar {
	
	private Foo foo;
	
	private List<String> stringListField;
	
	private List<Date> dateListField;
	
	private List<Foo> fooListField;
	
	private Map<String, String> stringStringMap;
	
	private Map<String, Foo> stringFooMap;

	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	public List<String> getStringListField() {
		return stringListField;
	}

	public void setStringListField(List<String> stringListField) {
		this.stringListField = stringListField;
	}

	public List<Date> getDateListField() {
		return dateListField;
	}

	public void setDateListField(List<Date> dateListField) {
		this.dateListField = dateListField;
	}

	public List<Foo> getFooListField() {
		return fooListField;
	}

	public void setFooListField(List<Foo> fooListField) {
		this.fooListField = fooListField;
	}

	public Map<String, String> getStringStringMap() {
		return stringStringMap;
	}

	public void setStringStringMap(Map<String, String> stringStringMap) {
		this.stringStringMap = stringStringMap;
	}

	public Map<String, Foo> getStringFooMap() {
		return stringFooMap;
	}

	public void setStringFooMap(Map<String, Foo> stringFooMap) {
		this.stringFooMap = stringFooMap;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bar [foo=").append(foo).append(", stringListField=")
				.append(stringListField).append(", dateListField=")
				.append(dateListField).append(", fooListField=")
				.append(fooListField).append(", stringStringMap=")
				.append(stringStringMap).append(", stringFooMap=")
				.append(stringFooMap).append("]");
		return builder.toString();
	}

}
