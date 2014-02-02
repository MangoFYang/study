package com.yangfan.study.webservice.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Foo {
	
	private String id;
	
	private int intField;
	
	private double doubleField;
	
	private Integer integerField;
	
	private Double doubleBoxField;
	
	private String stringField;
	
	private Date dateField;
	
	private BigDecimal bigDecimalField;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIntField() {
		return intField;
	}

	public void setIntField(int intField) {
		this.intField = intField;
	}

	public double getDoubleField() {
		return doubleField;
	}

	public void setDoubleField(double doubleField) {
		this.doubleField = doubleField;
	}

	public Integer getIntegerField() {
		return integerField;
	}

	public void setIntegerField(Integer integerField) {
		this.integerField = integerField;
	}

	public Double getDoubleBoxField() {
		return doubleBoxField;
	}

	public void setDoubleBoxField(Double doubleBoxField) {
		this.doubleBoxField = doubleBoxField;
	}

	public String getStringField() {
		return stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}

	public Date getDateField() {
		return dateField;
	}

	public void setDateField(Date dateField) {
		this.dateField = dateField;
	}

	public BigDecimal getBigDecimalField() {
		return bigDecimalField;
	}

	public void setBigDecimalField(BigDecimal bigDecimalField) {
		this.bigDecimalField = bigDecimalField;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Foo [id=").append(id).append(", intField=")
				.append(intField).append(", doubleField=").append(doubleField)
				.append(", integerField=").append(integerField)
				.append(", doubleBoxField=").append(doubleBoxField)
				.append(", stringField=").append(stringField)
				.append(", dateField=").append(dateField)
				.append(", bigDecimalField=").append(bigDecimalField)
				.append("]");
		return builder.toString();
	}
	
}
