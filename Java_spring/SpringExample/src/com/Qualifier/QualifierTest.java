package com.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context=new ClassPathXmlApplicationContext("Qualifierxml.xml");
  PersonQualifier p=(PersonQualifier) context.getBean("personqualifier");
  p.getage();
  p.getname();
	}

}
