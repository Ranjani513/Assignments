package com.nisum;

import java.util.*;;

public class A26 {

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
  Arrays.sort(a);
  System.out.println("Max in the array:"+a[a.length-1]);
  System.out.println("Min in the array:"+a[0]);
	}

}
