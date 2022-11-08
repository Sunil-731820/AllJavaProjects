package com.java.hib.MappingSetInXML;

import java.util.Set;

public class Question {
	
	private int qId;
	private String questionName;
	private Set<String> choices;
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public Set<String> getChoices() {
		return choices;
	}
	public void setChoices(Set<String> choices) {
		this.choices = choices;
	}
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", questionName=" + questionName + ", choices=" + choices + "]";
	}
	
	
	
	
	
	
	

}
