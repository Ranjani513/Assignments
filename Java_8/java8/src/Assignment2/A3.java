// 3.Given a list contains  strings.Find the strings which are starting with vowels

//List<String> numberList={"hello","owl","mkitty","uber"}

package Assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numberList=Arrays.asList("hello","owl","mkitty","uber");
		
List<String> l= numberList.stream().filter(n->(n.charAt(0)=='a' ||n.charAt(0)=='e'||n.charAt(0)=='i'||n.charAt(0)=='o'||n.charAt(0)=='u' )).collect(Collectors.toList());
l.forEach(System.out::println);
	

	}

}
