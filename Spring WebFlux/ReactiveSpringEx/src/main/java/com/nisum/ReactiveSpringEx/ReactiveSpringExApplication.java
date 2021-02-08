package com.nisum.ReactiveSpringEx;

import java.util.UUID;
import java.util.stream.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nisum.ReactiveSpringEx.model1.Student;
import com.nisum.ReactiveSpringEx.repository.StudentRepository; 
@SpringBootApplication
public class ReactiveSpringExApplication {
@Bean
CommandLineRunner students(StudentRepository studentRepository)
{
	return args->
	{
		studentRepository.deleteAll()
		.subscribe(null,null,()->{
			Stream.of(new Student("1","raga", 30000),
					new Student("2","Ranajni", 26000)).forEach(student->{
				studentRepository.save(student).subscribe(System.out::println);
			});
		
	
	});

	};
}

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringExApplication.class, args);
	}

	}
