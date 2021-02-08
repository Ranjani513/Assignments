package com.annotationapproach;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	private String name;

	public Person() {
		System.out.println("In Person Bean constructor called");
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("Bean HelloWorld has been " + "instantiated and I'm the " + "init() method");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Conatiner has been closed " + "and I'm the destroy() method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
