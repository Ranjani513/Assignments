package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("collections.xml");
Student stu=context.getBean("student",Student.class);
System.out.println(stu.getname()+"\n"+stu.getcourses()+"\n"+stu.getfee());
	}

}
