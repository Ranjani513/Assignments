//23)Create a class parent class Nisum and subclass Employee. Access instance variables of Nisum from Employee without using super keyword.


package com.Ass2;

public class A23 {
public static void main(String []args)
{
	Employee e=new Employee();
	e.display();
}
}
class Nisum extends A23{
 static  String name="Ranjani";
  String desg="Trainee software engineer";
	
}
class Employee extends Nisum
{
	String name1=Nisum.name;
	public void display()
	{
		System.out.println("name:"+name1+"\n"+"designation:"+desg);
		
	}
}
