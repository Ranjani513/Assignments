package com.nisum.sql;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDAOimpl implements StdentDAO {
public static List<Student> list=new ArrayList<>();
	@Override
	public List<Student> getallstudentdetails() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		list.add(student);
		return null;
	}

	@Override
	public Student updatestudent(Student student) {
		// TODO Auto-generated method stub
		list.get(student.getRollNo()).setName(student.getName());
		return null;
	}

	@Override
	public Student deletestudent(Student student) {
		// TODO Auto-generated method stub
		list.remove(list.get(student.getRollNo()));
		
		return null;
	}

}
