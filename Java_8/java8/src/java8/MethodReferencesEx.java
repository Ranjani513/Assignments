package java8;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodReferencesEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> li=new ArrayList<>();
		li.add(new Student("Ranjani1",1));
		li.add(new Student("Ranjani1",2));
		li.add(new Student("Ranjani2",1));
		List<Employee> emp1=Arrays.asList(new Employee("Ranjani","SE",2),new Employee("Manasa","SE1",3),new Employee("Divya","SE2",4));
		Map<String,List<Employee>> e=emp1.stream().collect(Collectors.groupingBy(Employee::desg1));
		System.out.println("Group by designation:"+e);
li.stream().filter(new MethodReferencesEx()::getres).forEach(a->System.out.println(a.getname()+ "\t"+a.id));
 //List<Integer> res=MethodReferencesEx::f;
		BiFunction<String, Integer, Student> bi=Student::new;
		bi.apply("Sushma", 2);
		List<Integer> l=Arrays.asList(1,3,2,4);
		//Predicate<Integer> p=( MethodReferencesEx::iseven);
		l.stream().map(MethodReferencesEx::iseven).forEach(n->System.out.println(n));
		LocalDate s= LocalDate.now();
		System.out.println(s);
		//DateTime s=new DateTime();
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		Map<Integer, List<Integer>> lii=l.stream().collect(Collectors.groupingBy(n->n%2));
		lii.forEach((k,v)->System.out.println("Value:"+v));
		Map<Boolean, List<Integer>> lii1=l.stream().collect(Collectors.partitioningBy(n->n%2==0));
		lii.forEach((k,v)->System.out.println("Value:"+v));
		Map<Object, List<Integer>> res=	li.stream().collect(Collectors.groupingBy(p->p.name,Collectors.mapping(Student::getid, Collectors.toList())));
		//res.forEach((k,v)->System.out.println("Keyyyy:"+k+"\t"+"Valueee:"+v));
		System.out.println(res);
addition a1=Student::new;
a1.get1("ranjani", 1);
//li.stream().filter( MethodReferencesEx::getres).forEach(a->System.out.println(a.getname()+ "\t"+a.id));
	}
   boolean getres(Student s)
	 {
	 	 return s.id>2;
	 }
	static String iseven(Integer t)
	 {
		 return "Even:"+(t%2==0);
	 }
	 
}

 interface addition {
  Student get1(String name,int id);
	}