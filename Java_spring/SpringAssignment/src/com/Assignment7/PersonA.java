package com.Assignment7;

public class PersonA {
PersonB b;
/*PersonA(PersonB b)
{
	this.b=b;
}*/
public PersonB getB()
{
	return b;
}
public void setB(PersonB b)
{
	this.b=b;
}
public void display()
{
	System.out.println(" Iam  in PersonA using Constructor autowiring or by Name or Bytype ");
	//System.out.println(b.getname());
	//System.out.println(b.getage());
	b.display();
}
}
