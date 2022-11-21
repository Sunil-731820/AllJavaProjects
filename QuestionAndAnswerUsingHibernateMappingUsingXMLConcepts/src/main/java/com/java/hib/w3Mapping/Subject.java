package com.java.hib.w3Mapping;

public class Subject implements Comparable<String>{
	
	private int subjectId;
	private String subjectName;
	
	

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Subject(String subjectName) {
		super();
		this.subjectName = subjectName;
	}



	public int getSubjectId() {
		return subjectId;
	}



	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}



	public String getSubjectName() {
		return subjectName;
	}



	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}



	@Override
	public int compareTo(String subject) {
		if(this==null) {
			return 1;
		}else if(subject==null) {
			return -1;
		}else {
			return this.compareTo(subject); 
		}
		
	}
	

}
