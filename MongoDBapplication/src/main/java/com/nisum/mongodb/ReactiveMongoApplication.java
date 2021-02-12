package com.nisum.mongodb;

import com.nisum.mongodb.model.Employee;
import com.nisum.mongodb.repository.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ReactiveMongoApplication {

	@Bean
	CommandLineRunner employees(EmployeeRepository  employeeRepository) {

		return args -> {employeeRepository.deleteAll().subscribe(null, null, () -> 
		{

				Stream.of(new Employee(UUID.randomUUID().toString(),"jani", 26000),
						new Employee(UUID.randomUUID().toString(),"Srinu", 26000),
						new Employee(UUID.randomUUID().toString(),"ganesh", 26000),
						new Employee(UUID.randomUUID().toString(),"dastagiri", 26000),
						new Employee(UUID.randomUUID().toString(),"Charan", 26000))
						.forEach(employee -> {employeeRepository.save(employee).subscribe(System.out::println);});

			});
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(ReactiveMongoApplication.class, args);
	}
}
