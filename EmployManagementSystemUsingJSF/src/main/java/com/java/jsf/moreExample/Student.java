package com.java.jsf.moreExample;

public class Student {
	
	private String name;
	private String stuClass;
	private String rollNo;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, String stuClass, String rollNo, int age) {
		super();
		this.name = name;
		this.stuClass = stuClass;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	
	
	

}
