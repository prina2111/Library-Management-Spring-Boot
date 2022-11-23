package com.accolite.beans;

public class Book {
	
	String name;
	String author;
	int price;
	Department department;

	public Book(String name, String author, int price, Department department) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.department = department;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
