package com.nisum;

import java.util.Scanner;

public class A31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows of first matrix");
		int m=sc.nextInt();
		System.out.println("Enter the no of cols of first matrix");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the no of rows of second matrix");
		int p=sc.nextInt();
		System.out.println("Enter the no of cols of second matrix");
		int q=sc.nextInt();
		int b[][]=new int[p][q];
		int r[][]=new int[n][p];
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		if(n==p) {
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<p;j++)
			{
				r[i][j]=0;
				for(int k=0;k<p;k++)
				{
					r[i][j]+=a[i][k]*b[k][j];
				
			}
			
		}
		}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<p;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}

}