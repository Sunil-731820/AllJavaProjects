package com.java.jsf.moreExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.java.jsf.moreExample.Employ;import com.java.jsf.moreExample.Student;

@ManagedBean(name = "test")
@SessionScoped
public class TestEmploy {
	
	private Employ employ;
	
	private static final List<Employ> employList = new ArrayList<Employ>(
			Arrays.asList(
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000),
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000),
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000),
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000),
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000),
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000),
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000),
				new Employ(1, "Sunil", "Kumar Gupta", "MALE", "LKO", 120000, 12000)
					)
			);
	
	
	public List<Employ> getListOfEmploy() {
		return employList;
	}
	
	
	public String deleteEmploy() {
		employList.remove(employ);
		return null;
	}




	public Employ getEmploy() {
		return employ;
	}
	
	public void setEmploy(Employ employ) {
		this.employ = employ;
	}

	
	
	

}
