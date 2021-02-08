package com.mainmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nisum.annotation.Person;

public class AnnotationTest {
ApplicationContext context=new AnnotationConfigApplicationContext("PersonConfig.class");
Person p=(Person)context.getBean("Person.class");

}
