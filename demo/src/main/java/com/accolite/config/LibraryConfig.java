package com.accolite.config;

import org.springframework.context.annotation.Configuration;

import com.accolite.beans.Book;
import com.accolite.beans.Department;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@Configuration
@ComponentScan(basePackages = {"com.accolite.beans","com.accolite.service","com.accolite.controller"})
public class LibraryConfig {
	
//	@@Bean("Accolite Library")
//	public Department department1() {
//		return new Department("CS",new ArrayList<>)
//	}

	@Bean("Cs")
	public Department department1() {
		return new Department("CS");
	}
	
	@Bean("It")
	public Department department2() {
		return new Department("IT");
	}
	
	@Bean("Sun")
	public Book book1() {
		return new Book("sun","Veena",800,department1());
	}
	
	@Bean("Moon")
	public Book book2() {
		return new Book("moon","Stuti",600,department2());
	}
	
	@Bean("Galaxy")
	public Book book3() {
		return new Book("galaxy","Prina",800,department1());
	}
	
	@Bean("Star")
	public Book book4() {
		return new Book("star","Veena",500,department2());
	}
	
}
