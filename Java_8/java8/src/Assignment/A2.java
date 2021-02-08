package Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> li=Arrays.asList(11,44,2,89);
	int maximum=li.stream().max(Comparator.naturalOrder()).get();
	System.out.println(maximum);
	List<Integer> minimum=li.stream().sorted().collect(Collectors.toList());
	System.out.println(minimum.get(0));
	Integer min1=li.stream().reduce(Integer::min).get();
	System.out.print(min1);
	}

}
