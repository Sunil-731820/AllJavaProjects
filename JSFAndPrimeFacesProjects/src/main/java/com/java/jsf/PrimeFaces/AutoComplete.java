package com.java.jsf.PrimeFaces;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AutoComplete {
	
	private String countryName;
	
	public List<String> countryList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Australia");
		list.add("Germany");
		list.add("Itlay");
		list.add("United State Of America");
		list.add("Russia");
		return list;
		
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
