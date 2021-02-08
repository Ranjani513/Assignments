package com.mainmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nisum.spring.Programaticapproach;

public class ProgramaticTest {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("Configp.xml");
	Programaticapproach p=(Programaticapproach)context.getBean("programbean1");
	System.out.println("Name:"+p.getName());
	((AbstractApplicationContext) context).registerShutdownHook();
}
}
