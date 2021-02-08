package com.Qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Profileconfig {
@Bean(name="personqualifier")
public PersonQualifier personqual()
{
	return new PersonQualifier();
}
@Bean(name="Person1")
public Person person1()
{
	Person p=new Person();
			p.setname("Ranjani");
	    p.setage(23);
	    return p;
}
@Bean(name="Person2")
public Person person2()
{
	Person p=new Person();
			p.setname("Divya");
	    p.setage(22);
	    return p;
}
}
