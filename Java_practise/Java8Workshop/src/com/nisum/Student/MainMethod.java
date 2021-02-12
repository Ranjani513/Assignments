package com.nisum.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nisum.Address.Address;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Student> stu=Arrays.asList(new Student("Ranjani","Raga",8,2),new Student("Akhila","Akhi",7,1),new Student("Divya","Gandhasiri",6,3),new Student("mamatha ","beepangi",4,4));
  List<Address> add=Arrays.asList(new Address("mori","sakhinetipalli","Hyderabad","ap","533250"),new Address("mallikipuram","amaalapuram","vizag","Telangana","532545"),new Address("eastcoast","karnataka","Hyderabad","ap","556764"),new Address("kakinada","palakole","vizag","ap1","534354"));
  StudentDetailswithAddressMaping sm=new StudentDetailswithAddressMaping();
  System.out.println("************************************id's mapping with address****************************");
 sm.addressdetails(stu,add);
 System.out.println("************************************Grouping by District****************************");
 sm.groupingbydist(stu, add);
List<Student> emp=stu.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
 System.out.println("************************************Sorted the student names with the first name****************************");
 emp.forEach(System.out::println);
List<Student> emp1=stu.stream().sorted(Comparator.comparing(Student::getid)).collect(Collectors.toList());
 System.out.println("************************************Sorted the student names with id****************************");
 emp1.forEach(System.out::println);
List<Student> stu1=stu.stream().filter(student->((student.getgpa()>5 && student.getgpa()<8))).collect(Collectors.toList());
System.out.println("************************************Student GPA >5 and GPA < 8****************************");
stu1.forEach(System.out::println);
System.out.println("************************************Maximun and minimum Gpa****************************");
Integer max=stu.stream().map(p->p.getgpa()).max(Integer::compare).get();
stu.stream().filter(st->st.Gpa==max).forEach(s->System.out.println("Maximum gpa occurred by a person:"+s.getFirstName()+" "+s.getLastName()+"With gpa:"+max));
Integer min=stu.stream().map(p->p.getgpa()).min(Integer::compare).get();
stu.stream().filter(st->st.Gpa==max).forEach(s->System.out.println("Minimum gpa occurred by a person:"+s.getFirstName()+" "+s.getLastName()+"With gpa:"+min));
Double avg=stu.stream().collect(Collectors.averagingInt(n->n.getgpa()));
System.out.println("************************************Average  Gpa****************************");
System.out.println(avg);

	}

}
