
/*2.Given a list contains a number as string.Find the numbers even numbers and which are less than 20

List<String> numberList={"3","4","21,"18","24","19","30","42"}
*/
package Assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A2 {
	/*public	 static Predicate<Integer> evennumber()
	 {
		 return n->n%2==0;
	 }
	public	 static Predicate<Integer> lessthan10()
	 {
		 return n->n<10;
	 }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> l=Arrays.asList("3","4", "21","18","24","19","30","42");
		List<String> l1=l.stream().filter(n->Integer.parseInt(n)%2==0).filter(n->Integer.parseInt(n)<20).collect(Collectors.toList());
		 l1.forEach(System.out::println);
	
	
	}

}
