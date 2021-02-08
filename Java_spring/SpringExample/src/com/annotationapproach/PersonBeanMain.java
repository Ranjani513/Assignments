package com.annotationapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonBeanMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
	//	Person bean = (Person) context.getBean("personBean-alias");
	Person bean = (Person) context.getBean("personBeanName");
		System.out.println(bean.getName());
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
