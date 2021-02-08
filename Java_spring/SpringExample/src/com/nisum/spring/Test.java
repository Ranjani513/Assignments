package com.nisum.spring;

import javax.annotation.Resource;
import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {  
	   ApplicationContext resource=new ClassPathXmlApplicationContext("applicationcontext.xml");  
	     
	      
	    Student student=(Student)resource.getBean("studentbean");  
	    student.Display();  
	}  
}
