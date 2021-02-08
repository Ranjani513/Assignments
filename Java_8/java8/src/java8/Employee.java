package java8;

public class Employee {
	String name;
	String desg;
	int id;

	public Employee(String name,String desg,int id) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.desg=desg;
		this.id=id;
	}
public String desg1()
{
	return desg;
}
public String toString()
{
	return name+"\t"+id+"\t"+desg;
}
}
