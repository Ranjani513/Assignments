package com.nisum.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

HelloWorld()
{
	System.out.println("I am in default constructor");
}
public void init()
{
	System.out.println("I am in init method");
}
@PostConstruct
public void destroy()
{
	System.out.println("I am in destroy method");
}
@PreDestroy
public void destroy1()
{
	System.out.println("I am in destroy1 method");
}
}
