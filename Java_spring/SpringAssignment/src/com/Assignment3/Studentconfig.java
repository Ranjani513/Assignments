package com.Assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Studentconfig {
public static void main(String[] args)
{
	ApplicationContext a=new ClassPathXmlApplicationContext("collection.xml");
	Student s= a.getBean("student",Student.class);
	System.out.println("Name:"+s.getname());
	System.out.println("Address:"+s.getaddress());
	System.out.println("Courses:"+s.getcourses());
	System.out.println("cost:"+s.getcost());
}
}
