// 5.Form the streams by all forms . from collection,from values, from array,from
package Assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,4};
 Stream.of(1,3,3,6).distinct().forEach(System.out::println);
 long c=Arrays.stream(a).count();
 System.out.println(c);
 Stream.iterate(2, (n)->n*n).limit(5).forEach(System.out::println);
//Stream.generate().limit(5).forEach(System.out::println);
Stream<String>  s=Stream.empty();
System.out.println(s);
List<Integer> li=Arrays.asList(1,2,4,3,5,6);
boolean res=li.stream().anyMatch(n->n==2);
	}

}
