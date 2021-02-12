package com.nisum.Student;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.nisum.Address.*;
public class StudentDetailswithAddressMaping {
public void addressdetails(List<Student> s,List<Address> a)
{
	//Map(List<Student> s,List<Address> a) map=
Map<Object, Object> m=s.stream().collect(Collectors.toMap(st->st.getFirstName(), st->a.get(st.getid()-1)));
	m.forEach((k,v)->System.out.println("FirstName:"+k+"\n"+"Address:"+"\n"+v));
}
public void groupingbydist(List<Student> s,List<Address> a)
{
	Map<Object, List<Address>>m=s.stream().map(student->a.get(student.getid()-1)).collect(Collectors.groupingBy(Address::getcity));
	m.forEach((k,v)->System.out.println(k+"\n"+v));
}
}
