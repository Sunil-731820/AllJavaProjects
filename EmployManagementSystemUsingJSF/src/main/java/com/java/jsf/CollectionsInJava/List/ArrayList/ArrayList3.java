package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	 int id;
	 String name;
	 int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

public class ArrayList3 {
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Sonno", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "HanuMat", 25);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("The List of The Student is ");
		System.out.println(list);
		
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.id + " "+ st.name+ " "+ st.age);
		}
	}

}
