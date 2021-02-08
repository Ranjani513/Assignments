package com.Assignment.Applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applicationconfig {
	public static void main(String[] args) {
ApplicationContext a=new ClassPathXmlApplicationContext("Application.xml");
Student s=(Student) a.getBean("stud");
s.Display();
}
}