//1.Given a list contains a number as string.Find the numbers which are divisible by 3.

//List<String> numberList={"3","4","21,"18","24","19","30","42"}
package Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> l=Arrays.asList("3","4", "21","18","24","19","30","42");
      List<String> res=l.stream().filter(n->Integer.parseInt(n)%3==0).collect(Collectors.toList());
      res.forEach(System.out::println);
	}

}
