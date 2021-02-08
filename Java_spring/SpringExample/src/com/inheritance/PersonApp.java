package com.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotationapproach.Person;

public class PersonApp {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("inheritance.xml");
	person p=context.getBean("student",person.class);
	/*p.getname();
	p.getid();
	p.getpersontype();*/
	System.out.println(p);
	
}
}
