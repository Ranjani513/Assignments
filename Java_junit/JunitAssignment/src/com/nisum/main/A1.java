package com.nisum.main;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class A1 {
public Integer max1(List<Integer> l)
{
	int max=0;
	for(Integer i:l)
	{
		if(i>max)
		{
			max=i;
		}
	}
	return max;
}
}
