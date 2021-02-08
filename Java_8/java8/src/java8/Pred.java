package java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java8.predict1;
public class Pred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> a=Arrays.asList(1,-1,-8,5);
long res=a.stream().filter(Predict.display()).count();
System.out.println(res);
	}

}
