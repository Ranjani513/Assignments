package com.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Applicationconfig {
	public static void main(String[] args) {
ApplicationContext a=new ClassPathXmlApplicationContext("Beanfactory.xml");
Student s=(Student) a.getBean("stu");
System.out.println("Using Simple Application Context");
s.Display();
}
}