package com.Assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beanconfig {
public static void main(String[] args)
{
	ApplicationContext con=new ClassPathXmlApplicationContext("Beanlifecycle.xml");
	BeanLifeCycle bean=(BeanLifeCycle) con.getBean("stu");
	System.out.println(bean.getName());
}
}
