package com.nisum;
import java.util.*;
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no of rows");
  int n=sc.nextInt();
  int out=1;
  for(int i=0;i<n;i++)
  {
	  for(int j=0;j<n-i;j++)
	  {
		  System.out.print(" ");
	  }
	  for(int k=0;k<=i;k++)
	  {
		  if(k==0 || i==0)
		  {
			  out=1;
		  }
		  else
		  {
			  out=out*(i-k+1)/k;
		  }
		  System.out.print(out+ " ");
	  }
	  System.out.println();
  }
	}

}
