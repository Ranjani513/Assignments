package java8;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a=null;
String b="";
Optional<String> res=Optional.of((Optional.ofNullable(b).filter(s->!s.isEmpty()).orElse("mamatha")));
System.out.println(res);
	}

}
