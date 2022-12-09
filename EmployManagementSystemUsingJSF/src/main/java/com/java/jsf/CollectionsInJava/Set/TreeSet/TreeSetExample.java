package com.java.jsf.CollectionsInJava.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Book o) {
		if (id>o.id) {
			return 1;
		}else if(id<o.id) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}


public class TreeSetExample {
	public static void main(String[] args) {
		System.out.println("This is the Example Of the Tree Set");
		Set<Book> set = new TreeSet<Book>();
		Book b1 = new Book(1, "C", "YashWant", "BPB", 8);
		Book b2 = new Book(21, "OS", "Galvin", "W", 10);
		Book b3 = new Book(10, "C", "YashWant", "BPB", 8);
		Book b4 = new Book(2, "OS", "Galvin", "W", 10);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		System.out.println("The Set Of The Book is ");
		System.out.println(set);
		
	}

}
