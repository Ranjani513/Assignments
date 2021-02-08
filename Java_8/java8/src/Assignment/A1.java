package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A1 {


public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0,count=0;
	 List<Integer> li=Arrays.asList(11,44,2,4,89);
	 count=li.size();
	 
int l=li.stream().map(n->n*n).filter(n->n<100).map(n->n).reduce(0,Integer::sum);
 //int sum1=l.stream().reduce(0, Integer::sum);
long c=li.stream().filter(n->n<100).count();
System.out.println("The average value is:"+l/c);
	 
	 
			 
		 
	 
}
}