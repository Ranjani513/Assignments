package com.nisum;

public class A24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<=4;i++)
    {
    	if(i==1)
    	{
    		System.out.println("*");
    	}
    	else
    	{
    		for(int j=1;j<=i*2-1;j++)
    		{
    			if(j==(i*2-1))
    			{
    				System.out.println("%");
    			}
    			else
    			{
    				System.out.print("*"+" ");
    			}
    		}
    	}
    }
	}

}