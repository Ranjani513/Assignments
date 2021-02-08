package com.Qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
public static void main(String[] args)
{
	//@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Profileconfig.class);
	//  @SuppressWarnings("resource")
	PersonQualifier p=(PersonQualifier)context.getBean("personqualifier");
	p.getage();
	p.getname();
}
}
