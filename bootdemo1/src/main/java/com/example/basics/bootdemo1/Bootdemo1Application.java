
package com.example.basics.bootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Bootdemo1Application {

	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(Bootdemo1Application.class, args);
		
	/*	for(String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
		
	}

}
