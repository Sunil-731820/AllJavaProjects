package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayList6 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		
//		For Serilization Of The Data 
		System.out.println(list);
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\sunilg\\Desktop\\Dependency\\FileRelatedParts\\Collections\\file1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(oos);
			oos.close();
			
//			Deserilization Of The Data 
			
			FileInputStream fis = new FileInputStream("C:\\Users\\sunilg\\Desktop\\Dependency\\FileRelatedParts\\Collections\\file1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list1 = (ArrayList) ois.readObject();
			System.out.println(list1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}

}
