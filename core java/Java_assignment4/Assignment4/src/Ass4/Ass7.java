/*Assignment 7:


1. Write a method which takes List as input and return list of items that are positioned in even indexed. [0, 2, 4]. use generics

2. Write a method to add items in a list which should allow max upto 5 items. it should throw if we try to add more items. use generics

3) Enhance the above method such that it should not throw error and replaces the next first occurrence. it should replace item of 0 index followed by next index and so on..
*/
package Ass4;

import java.util.ArrayList;

public class Ass7 {
	static int count=0;
	static int count1=0;
	static int count2=0;
	static int count3=0;
public static void even(ArrayList<Integer> a)
{
	for(int s:a) {
	if(count%2==0)
	{
		System.out.println(s);
	}
	count++;
}
}
public static void replace(ArrayList<Integer> a,ArrayList<Integer> a1)
{

	for(int s:a) {
		
		if(count2<5)
		{
			a1.add(s);
			//System.out.println(count2);
		}
		else
		{
           
          a1.remove(count3);
          a1.add(count3,s);
           
           count3++;
     
           
			}
		
		count2++;

		
		}
			
		}
	

	public static void list(ArrayList<Integer> a,ArrayList<Integer> a1) throws Exception
	{
		for(int s:a) {
			
			if(count1<5)
			{
				a1.add(s);
			}
			else
			{
				for(int y:a1) {
				System.out.println(y);
				}
				throw new Exception("Exceed the count");
				
			}
			count1++;
			
	}
		
	}
public static void main(String[] args) throws Exception
{
	ArrayList<Integer> a1=new ArrayList<>();
	ArrayList<Integer> a=new ArrayList<>();
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(6);
	a.add(10);
	a.add(76);
	a.add(100);
	a.add(101);
	a.add(102);
	System.out.println("list of even");
	Ass7.even(a);
	System.out.println("list after replace");
	Ass7.replace(a, a1);
  for(int g:a1)
	{
		System.out.println(g);
	}

	System.out.println("list of 5");
	Ass7.list(a, a1);
		
}
}