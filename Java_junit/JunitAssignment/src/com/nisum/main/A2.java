package com.nisum.main;

public class A2 {
public int divide(int a,int b)
{
	if(b<=0)
	{
		throw new UserException("Invalid data");
	}
	else
	{
		return a/b;
	}
}
}
