package com.nisum.ReactiveSpringEx.resource;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nisum.ReactiveSpringEx.model1.Student;
import com.nisum.ReactiveSpringEx.model1.StudentEvents;
import com.nisum.ReactiveSpringEx.repository.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
@RestController
@RequestMapping("/rest/student")
public class StudentResource {
	private StudentRepository studentRepository;
	public StudentResource(StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}
@GetMapping("/all")
public Flux<Student> getall()
{
	return studentRepository.findAll();
	
	
}
@GetMapping("/{id}")
public Mono<Student> getid(@PathVariable("id") final String stuId)
{
	return studentRepository.findById(stuId);
}
@GetMapping(value = "/{id}/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
public Flux<StudentEvents> getEvents(@PathVariable("id")
final String stuId) {
	return studentRepository.findById(stuId).flatMapMany(student->{
		Flux<Long> interval=Flux.interval(Duration.ofSeconds(1));
		Flux<StudentEvents> studentEventFlux =Flux.fromStream(Stream.generate(()->new StudentEvents(student,new Date()))
	);
		return Flux.zip(interval,studentEventFlux).map(Tuple2::getT2);
	});
	
	
}
}
