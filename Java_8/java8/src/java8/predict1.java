package java8;

import java.util.function.Predicate;

public class predict1 implements Predicate<Integer> {

	@Override
	public  boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>0;
	}

}
