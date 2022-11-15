package com.java.jsf.moreExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "test")
@SessionScoped
public class Test {
	
	private Student student;
	
	
	private static final List<Student> studentList = new ArrayList<Student>(
			Arrays.asList(
					new Student("Vivek","MCA 3rd","MCA/07/40",29),
					new Student("Sunil","MCA 3rd","MCA/07/41",33),
					new Student("Bharat","MCA 3rd","MCA/07/42",27),
					new Student("Richi","MCA 3rd","MCA/07/43",28),
					new Student("Sahdev","MCA 3rd","MCA/07/44",28)							)
			);
	
	public List<Student> getStudents(){
		return studentList;
	}
	
	public String deleteStudent(){
		studentList.remove(student);
	    return null;
   }
 
	public Student getStudent() {
		return student;
	}
 
	public void setStudent(Student student) {
		this.student = student;
	}


}
