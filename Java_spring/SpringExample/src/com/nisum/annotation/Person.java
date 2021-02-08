package com.nisum.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
String name;
public void setName(String name)
{
	this.name=name;
}

public String getName()
{
	return name;
}
public void diaplay()
{
	System.out.println("Name:"+name);
}
@PostConstruct
public void init() throws Exception {
	System.out.println("Bean HelloWorld has been " + "instantiated and I'm the " + "init() method");
}

@PreDestroy
public void destroy() throws Exception {
	System.out.println("Conatiner has been closed " + "and I'm the destroy() method");
}

}
