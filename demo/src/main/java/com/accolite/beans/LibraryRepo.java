package com.accolite.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LibraryRepo {

	Book sun;
	Book moon;
	Book star;
	Book galaxy;
	

	public  Book getSun() {
		return sun;
	}

	@Autowired
	@Qualifier("Sun")
	public void setSun(Book sun) {
		this.sun = sun;
	}

	public Book getMoon() {
		return moon;
	}

	@Autowired
	@Qualifier("Moon")
	public void setMoon(Book moon) {
		this.moon = moon;
	}

	public Book getStar() {
		return star;
	}

	@Autowired
	@Qualifier("Star")
	public void setStar(Book star) {
		this.star = star;
	}
	
	public Book getGalaxy() {
		return galaxy;
	}

	@Autowired
	@Qualifier("Galaxy")
	public void setGalaxy(Book galaxy) {
		this.galaxy = galaxy;
	}
	
	
}
