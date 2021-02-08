package com.mainmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nisum.spring.HelloWorld;

public class HelloworldTest {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	HelloWorld h=(HelloWorld)context.getBean("stu");
	
}
}
