package com.annotationapproach;

import org.springframework.beans.factory.annotation.Autowired;

public class Beanone {
@Autowired
private Bean2 bean2;
@Autowired
private Bean3 bean3;
public Beanone()
{
	System.out.println("I am in counstructor bean1");
}
public void dosomething()
{
	System.out.println("I am in bean1");
	bean2.dosomething();
	bean3.dosomething();
}
}
