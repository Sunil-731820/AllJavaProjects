package com.java.jsf.CollectionsInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileMain {
	
	public static void main(String[] args) throws IOException {
		
		String content = "";
		File file = new File(
	            "C:\\Users\\sunilg\\Desktop\\QuestionsOfProvider.txt");
	 
	        // Creating an object of BufferedReader class
	        BufferedReader br
	            = new BufferedReader(new FileReader(file));
	 
	        // Declaring a string variable
	        String st;
	        // Condition holds true till
	        // there is character in a string
	        while ((st = br.readLine()) != null) {
	        	content +=st;
	        	System.out.println(content+"\n");
//	        	System.out.println();
	            // Print the string
//	            System.out.println(st);
	        }
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("the content is ");
	        System.out.println(content);
	        		
	}
	

}
