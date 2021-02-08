package com.Assignment8;

public class BeanLifeCycle {
	String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void init()
	{
		System.out.println("I am in init method");
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("I am in destroy method");
	}

	
}


