package com.java.hib.MappinUsingMapInXML;

import java.util.Map;


public class QuestionDataForMap {
	private int qId;
	private String questionName;
	private Map<String,String> choices;
	
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
	public Map<String, String> getChoices() {
		return choices;
	}
	public void setChoices(Map<String, String> choices) {
		this.choices = choices;
	}
	@Override
	public String toString() {
		return "QuestionDataForMap [qId=" + qId + ", questionName=" + questionName + ", choices=" + choices + "]";
	}
	public QuestionDataForMap(String questionName, Map<String, String> choices) {
		super();
		this.questionName = questionName;
		this.choices = choices;
	}
	
	
	
	
}
