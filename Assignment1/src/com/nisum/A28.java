package com.nisum;

import java.util.Scanner;

public class A28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size opf the array");
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  for(int i=1;i<n;i++)
		  {
			  while(a[i-1]>a[i] && i>0)
			  {
				  int t=a[i-1];
				  a[i-1]=a[i];
				  a[i]=t;
				  i--;
			  }
		  }
		  for(int i=0;i<n;i++)
		  {
			  System.out.println(a[i]);
		  }
	}

}
