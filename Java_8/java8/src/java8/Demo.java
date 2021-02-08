package java8;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> li=new ArrayList<>();
 li.add(1);
 li.add(2);
 li.add(3);
 li.add(4);
 li.forEach(System.out::println);
 
	}

}
