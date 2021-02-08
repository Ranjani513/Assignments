package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Employeeimpl {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Employee> l=new ArrayList<>();
  l.add(new Employee("Ranjani","software",1));
  l.add(new Employee("Ranjani1","software1",8));
  l.add(new Employee("Ranjani2","software2",3));
  l.add(new Employee("Ranjani3","software3",9));
  Stream<Employee> s=l.stream().filter(p->(p.id<5));
  s.forEach(n->System.out.println(n.name+" \t"+n.desg));
	}

}
