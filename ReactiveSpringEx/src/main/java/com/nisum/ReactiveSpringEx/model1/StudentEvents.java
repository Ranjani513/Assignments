package com.nisum.ReactiveSpringEx.model1;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class StudentEvents {
	private Student student;

	private Date date;
public StudentEvents(Student student, Date date) {
		super();
		this.student = student;
		this.date = date;
	}

public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}
