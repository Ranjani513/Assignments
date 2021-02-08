package com.Assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Assignment6.PersonQualifier;

public class QuaifierTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context=new ClassPathXmlApplicationContext("Qualifier.xml");
  PersonQualifier p=(PersonQualifier) context.getBean("personqualifier");
  p.getage();
  p.getname();
	}

}
