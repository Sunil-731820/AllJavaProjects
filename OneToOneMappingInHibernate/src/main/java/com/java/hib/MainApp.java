package com.java.hib;

import com.java.hib.dao.InstructorDao;
import com.java.hib.entity.Instructor;
import com.java.hib.entity.InstructorDetail;

public class MainApp {
	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Sunil", "Kumar", "Sunil@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Blog");
		instructor.setInstructorDetail(instructorDetail);
		InstructorDao dao = new InstructorDao();
		dao.saveInstructor(instructor);
		
	}

}
