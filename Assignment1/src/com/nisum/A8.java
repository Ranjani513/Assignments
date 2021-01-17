package com.nisum;

import java.util.Arrays;
import java.util.Scanner;

public class A8 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size opf the array");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  int count=0,max=0,res=0;
	  for(int i=0;i<n-1;i++)
	  {
		  count=0;
		  for(int j=1;j<n;j++)
			  {
			  if(a[i]==a[j])
			  {
				  count++;
			  }
			  }
		  if(count>max)
		  {
			  res=a[i];
			  max=count;
		  }
			  }
	  System.out.println(res);
}
}
