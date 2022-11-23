package com.java.jsf.PrimeFaces;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoComplete {
	
	private String countryName;
	
	
	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public List<String> countryList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("AUstralia");
		list.add("Germany");
		list.add("Russia");
		return list;
	}
}
