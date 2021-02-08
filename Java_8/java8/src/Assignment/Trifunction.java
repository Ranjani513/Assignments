package Assignment;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Trifunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum<Integer,Integer,Integer,Integer> s=(a,b,c)->(a+b+c);
System.out.println(s.apply(8, 8, 8));

	}

}

interface sum<T,T1,U,R>{
	R apply(int a,int b,int c);
}