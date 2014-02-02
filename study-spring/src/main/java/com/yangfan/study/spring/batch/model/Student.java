package com.yangfan.study.spring.batch.model;

public class Student {

	/** ID */
	private String ID;
	
	/** 名字 */
	private String name;
	
	/** 年龄 */
	private int age;
	
	/** 分数 */
	private float score;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [ID=").append(ID).append(", name=")
				.append(name).append(", age=").append(age).append(", score=")
				.append(score).append("]");
		return builder.toString();
	}
	
}
