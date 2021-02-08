package com.annotationapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Maindependson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Beandependson.class);
Beanone b=context.getBean(Beanone.class);
b.dosomething();
context.close();
	}

}
