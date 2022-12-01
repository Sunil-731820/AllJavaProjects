package com.java.jsf.CollectionsInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ReadingFileAndDisplay {
	private String content ="Hello ";

public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

public void readFile() throws IOException {
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
        	 // Print the string
            System.out.println(st);
        }
 
           
}
	
}
