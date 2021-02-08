/*Assignment 8:

1. Write a method which takes list of Order objects and return sum of prices of all orders. 
	[ id, price ] using for loop.
2. Write a method which takes list of Order objects and return average of last three orders prices. 
	[ id, price ].
3. Write a method which takes list of Order objects should return order with max price.



*/
package Ass4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order2 {
	String id;
	double price;
	static double sum=0;
	static double sum1=0;
	static double avrg=0;
	static int count=0;
	static int index;
	static double max=0;
	static int c=0;
	static String res;
	static ArrayList<Order2> a=new ArrayList<>();
	Order2(String id,double price)
	{
		this.id=id;
		this.price=price;
	}
	
	public Order2(Order2 u) {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "["+id+","+price+"]";
	}
	public static void verify(ArrayList<Order2> a)
	{
		Iterator<Order2> it=a.iterator();
		while(it.hasNext())
		{
			Order2 u=it.next();
			sum=sum+u.price;
			
			
		}
	}
public static  void avg(ArrayList<Order2> a)
	{
	int l=a.size();
	count=l-3;
	int c=0;
		Iterator<Order2> it=a.iterator();
	
		while(it.hasNext())
		{
			Order2 u=it.next();
			if(c>count-1) {
			sum1=sum1+u.price;
			avrg=sum1/3;
			}
			
			c++;
			
		}
		System.out.println("Average of last 3 prices:"+avrg);
			
		
	
	}
public static  void maxm(ArrayList<Order2> a)
{
	Iterator<Order2> it= a.iterator();
	
	while(it.hasNext())
	{
		Order2 u=it.next();
		if(u.price>max)
		{
			max=u.price;
			res=u.id;
			
		}
		
	}
	
	/*	if(a.price>max)
		{
			max=a.price;
			index=in;
			
		}*/
}

	public static void main(String[] args)
	{
		ArrayList<Order2> a=new ArrayList<>();

	a.add(new	Order2 ( "O345" , 23 ));
	a.add(new Order2( "O456" , 24 ));
	a.add(new Order2("O789" , 25 ));
	a.add(new Order2( "O346" , 26 ));
	a.add(new Order2("O347" , 27 ));
	a.add(new Order2( "O348" , 28 ));
	a.add(new Order2( "O678" , 89 ));
	Order2.verify(a);
	System.out.println("total price:"+sum);
	Order2.avg(a);
	Order2.maxm(a);
	System.out.println("Maximum price in the list is:"+"\t"+res+"\t"+max);
	
	}

}
