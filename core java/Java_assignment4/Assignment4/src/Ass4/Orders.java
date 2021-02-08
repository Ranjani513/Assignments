/*1. create a set of order objects having properties [ id, price ] as below and find out the orders with
highest and lowest price values.
	order [ "290", 500.00 ]
	order [ "290", 550.00 ]
	order [ "291", 600.00 ]
	order [ "292", 1200.00 ]
	order [ "293", 550.00 ]
	order [ "294", 1200.00 ]
	order [ "295", 900.00 ]

2. write another program for above orders and find orders with lowest &amp; highest order ids.
*/
package Ass4;

import java.util.ArrayList;

public class Orders {
	String id;
	double price;
	static ArrayList<Orders> a=new ArrayList<>();
	static double max=0;
	static double min=100000;
	static int index=0;
	static int index2=0;
	static Orders o;
	Orders(String id,double price)
	{
		this.id=id;
		this.price=price;
	}
	public String toString()
	{
		return "["+id+","+price+"]";
	}
	public static  void filter(Orders a,int in)
	{
		
			if(a.price>max)
			{
				max=a.price;
				index=in;
				
			}
			if(a.price<min)
			{
				min=a.price;
				index2=in;
			}

		}
	

	public static void main(String[] args)
	{
		//ArrayList<Orders> a=new ArrayList<>();

	Orders a1=new Orders ( "290", 500.00 );
	Orders a2=new Orders ( "290", 550.00 );
	Orders a3=new Orders( "291", 600.00 );
	Orders a4=new Orders( "292", 1200.00 );
	Orders a5=new Orders ("293", 550.00 );
	Orders a6=new Orders ("294", 1200.00 );
	Orders a7=new Orders ("295", 900.00 );
	Orders a[]= {a1,a2,a3,a4,a5,a6,a7};
	//Orders.filter(a);
	for(int i=0;i<a.length;i++)
	{
		a[i].filter(a[i],i);
	}
	
	//System.out.println(min);
	System.out.println("order with lowest price:"+a[index2]);
	System.out.println("order with highest price:"+a[index]);
	}

	}


