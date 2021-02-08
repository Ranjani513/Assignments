package com.annotationapproach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.*;

@Configuration
public class Beandependson {
@Bean(name="beanone")
@DependsOn(value = {"bean2","bean3"})
public  Beanone getbeanone()
{
	return new Beanone();
}
@Bean(name="bean2")
public Bean2 getbean2()
{
	return new Bean2();
}
@Bean(name="bean3")
public Bean3 getbean3()
{
	return new Bean3();
}

}
