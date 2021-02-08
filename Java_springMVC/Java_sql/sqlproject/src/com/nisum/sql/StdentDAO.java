package com.nisum.sql;

import java.util.List;

public interface StdentDAO  {
List<Student> getallstudentdetails();
Student addstudent(Student student);
Student updatestudent(Student student);
Student deletestudent(Student student);

}
