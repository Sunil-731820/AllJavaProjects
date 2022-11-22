package com.java.jsf.moreExample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "conditionalNavigation")
public class ConditionalNavigation {
	
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	
	
	public String displayPage() {
		if(pageId==null) {
			return "home";
		}
		else if (pageId.equals("test1")) {
			return "test1";
		}
		else if (pageId.equals("test2")) {
			return "test2";
		}
		else if(pageId.equals("test3")) {
			return "test3";
		}
		else  {
			return "home";
		}
	}
	
	

}
