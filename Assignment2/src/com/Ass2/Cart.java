//3) Write a program to create multiple 'Item' objects which has variables like itemName,itemValue and itemId. Validate the values of these variables and build an order summary with
//itemsCount and orderTotal within the 'Cart' class.


package com.Ass2;

import java.util.Scanner;

public class Cart {
static int itemvalue;
int itemid;
static String itemname;
static int res=0;
 static int count;
 static int count1;
static int totalorders=0;
static int orders;
static double cost;
static double tcost;
Cart(int itemvalue,int itemid,String itemname ,int count,double cost)
{
	this.itemvalue=itemvalue;
	this.itemid=itemid;
	this.itemname=itemname;
	this.count=count;
	this.cost=cost;
}
public  void getdetails() {

System.out.println();
}
public static void main(String args[])
{
	int	itemvalue1=5;
	int	itemvalue2=6;
	int	itemvalue3=7;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the orders:");
	orders=sc.nextInt();
	
	while(orders!=0) {
		System.out.println("Enter the any itemid from 1 to 3:");
		int itemid=sc.nextInt();
	switch (itemid) {
	case 1:
		System.out.println("Enter the count of the first items");
		count=sc.nextInt();
		count1=count+count1;
	
		Cart c=new Cart(itemvalue1,itemid,"biscuits",count,5);
		if(itemvalue1>count) {
		totalorders++;
		tcost=(count*cost)+tcost;
	  System.out.println("Available Items in id 1 has itemvalue"+itemvalue+"\n"+"itemname:"+itemname);
	  res=itemvalue-count;
	  System.out.println("totalvalue:"+itemvalue+"\n "+"remaining:"+res);
		itemvalue1=res;
		}
		
		else
		{
			System.out.println("count exceeds the itemvalue please enter the valid count");
		}
	  break;
	case 2:
		System.out.println("Enter the count of the second items");
		count=sc.nextInt();
		count1=count+count1;
		Cart c1=new Cart(itemvalue2,itemid,"choclates",count,6);
		if(itemvalue2>count) {
		totalorders++;
		tcost=(count*cost)+tcost;
	  System.out.println("Available Items in Item id 2 has itemvalue"+itemvalue+"\n"+"itemname:"+itemname);
	  res=itemvalue2-count;
	  System.out.println("totalvalue:"+itemvalue+"\n "+"remaining:"+res);
		itemvalue2=res;
	}
		else
		{
			System.out.println("count exceeds the itemvalue please enter the valid count");
		}
	  break;
	case 3:
		System.out.println("Enter the count of the third  items");
		count=sc.nextInt();
		count1=count+count1;
		Cart c2=new Cart(itemvalue3,itemid,"sweets",count,10);
		if(itemvalue3>count) {
		totalorders++;
		tcost=(count*cost)+tcost;
	  System.out.println("Available Items in Item id 3 has itemvalue"+itemvalue+"\n"+"itemname:"+itemname);
	  res=itemvalue-count;
	  System.out.println("total value:"+itemvalue+"\n"+"remaining:"+res);
	  itemvalue3=res;
	  }
		else
		{
			System.out.println("count exceeds the itemvalue please enter the valid count");
		}
	  break;
	  default:
		  System.out.println("Enter the valid id");
		  break;
	}
	orders--;
	}
	System.out.println("Totalorders:"+totalorders+"\t"+"total count:"+count1+"\t"+"Total cost of the items:"+tcost);
	
}
}