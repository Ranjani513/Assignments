package webApp.nisum;

public class Student {
String name;
String id;
Student(String name,String id)
{
	this.name=name;
	this.id=id;
}
public void setname(String name)
{
	this.name=name;
}
public String getname()
{
	return name;
}
public void setid(String id)
{
	this.id=id;
}
public String getid()
{
	return name;
}
public String toString()
{
	return "Name:"+name+"\n"+"Id:"+id+"\n";
}
}