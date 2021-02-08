/*4.Given a list contains  strings. find the the string which are in palindrome

List<String> numberList={"hello","aoa","mkitty","uber"}*/
package Assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A4 {
	static StringBuffer sb1=null;
	public static boolean display(String n)
	{
		String s="";
		String d=n;
	for(int i=n.length()-1;i>=0;i--)
	{
		s=s+n.charAt(i);
	}
	
if((s.equals(d)))
	 {
		 return true;
	 }
	 else 
		 return false;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numberList=Arrays.asList("hello","aoa","mkitty","uber","mom");
		List<String> li=numberList.stream().filter(n->display(n)).collect(Collectors.toList());
	    li.forEach(System.out::println);
		//A4.display("hello");
	
	}
	

}
