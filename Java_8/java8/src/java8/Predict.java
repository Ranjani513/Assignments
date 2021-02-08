package java8;

import java.util.function.Predicate;

public class Predict {
public static Predicate<Integer> display()
{
	return new Predicate<Integer>(){

		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return t%2==0;
		}
		
	};
		
}
}
