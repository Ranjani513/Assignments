package demo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Messagedigest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
MessageDigest md=MessageDigest.getInstance("SHA");
String s="Welcome to nisum";
md.update(s.getBytes());
byte b[]=md.digest();
System.out.println(b);
	}

}
