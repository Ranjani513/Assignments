package com.nisum.mongodb.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nisum.mongodb.model.Employee;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> 
{
	
}
