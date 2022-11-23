package com.accolite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.service.LibraryService;

@RestController
public class LibraryController {
	public LibraryService getLibService() {
		return libService;
	}
	@Autowired
	public void setLibService(LibraryService libService) {
		this.libService = libService;
	}

	LibraryService libService;
	
	@GetMapping("/bookNames")
	public List<String> getNames(){
		return libService.getBooks();
		
	}

}
