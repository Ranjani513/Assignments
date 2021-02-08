package com.nisum.main;

public class A4 {
public boolean prime(int j)
{
	int flag=0;
	for(int i=2;i<j/2;i++)
	{
		if(j%i==0)
		{
			flag=1;
		    break;
		}
	}
	if(flag==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
