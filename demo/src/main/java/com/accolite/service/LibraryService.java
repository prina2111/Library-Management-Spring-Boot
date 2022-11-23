package com.accolite.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.beans.LibraryRepo;

@Service
public class LibraryService {
	
@Autowired
LibraryRepo libraryRepo;

public List<String> getBooks(){
	List<String> books=new ArrayList<>();
	books.add(libraryRepo.getSun().getName());
	books.add(libraryRepo.getMoon().getName());
	books.add(libraryRepo.getGalaxy().getName());
	books.add(libraryRepo.getStar().getName());
	return books;
	}

}