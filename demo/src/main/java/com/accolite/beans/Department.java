package com.accolite.beans;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	public Department(String name) {
		super();
		this.name = name;
//		this.bookList = bookList;
//		this.libName = libName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	String name;
	List<Book> bookList = new ArrayList<>();
	
	

}
