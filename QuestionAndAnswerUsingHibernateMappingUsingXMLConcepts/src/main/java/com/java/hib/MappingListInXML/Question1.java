package com.java.hib.MappingListInXML;

import java.util.List;

public class Question1 {
	private int qId;
	private String questionName;
	
//	One Question Have Many Choices Right
	private List<String> choices;

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

	public List<String> getChoices() {
		return choices;
	}

	public void setChoices(List<String> choices) {
		this.choices = choices;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", questionName=" + questionName + ", choices=" + choices + "]";
	}
	
	


}
