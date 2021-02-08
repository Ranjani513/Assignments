package com.Assignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Personconfig {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("Required.xml");
	PersonA p=(PersonA) context.getBean("a",PersonA.class);
	p.display();
	
}
}
