// 2) Sort all product objects based on the price using comparable.
package Ass4;

import java.util.ArrayList;
import java.util.Collections;

public class A1_2 implements Comparable<A1_2> {
String name;
int id;
double price;
A1_2(String name,int id,double price)
{
	this.name=name;
	this.id=id;
	this.price=price;
}
public int compareTo(A1_2 a)
{
	return this.id-a.id;
	
}
public String toString()
{
	return name+"\t"+id+"\t"+price;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		ArrayList<A1_2> list=new ArrayList<>();
      list.add(new A1_2("Ranjani",3,12));
     list.add(new A1_2("ramya",2,34.66));
     list.add(new A1_2("sushma",1,9));
      list.add(new A1_2("akhila",5,7));
     list.add(new A1_2("komala",4,11));
     list.add(new A1_2("bala",7,9));
     list.add(new A1_2("sruthi",8,1));
     list.add(new A1_2("manasa",6,5));
      
    Collections.sort(list);
    for(A1_2 a1:list)
    {
    	System.out.println(a1);
    }
	}
	
}
