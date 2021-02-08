package Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> li=Arrays.asList(11,44,2,89);
		// li.sort(Comparator.naturalOrder());
		 Collections.sort(li);
		 Stream<Integer> str=li.stream();
		str.forEach(n->System.out.println(n));
	}

}
