package com.nisum.ReactiveSpringEx.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nisum.ReactiveSpringEx.model1.Student;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

}
