package com.accolite.beans;

public class Library {
	
	String name;
	String address;
	String librarian;
	Department department;
	
	public Library(String name, String address, String librarian, Department department) {
//		super();
		this.name = name;
		this.address = address;
		this.librarian = librarian;
		this.department = department;
	}
	
	public String getLibrarian() {
		return librarian;
	}
	public void setLibrarian(String librarian) {
		this.librarian = librarian;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
