/*3) Write a program to print Minimum and maximum numbers using Math class?
	int i1 = 27;
  	int i2 = -45;
  	double d1 = 84.6;
  	double d2 = 0.45;*/
  import java.util.*;
  import java.lang.Math;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 27;
	  	int i2 = -45;
	  	double d1 = 84.6;
	  	double d2 = 0.45;
	  	int res=Math.max(i1, i2);
	  	int res1=Math.min(i1, i2);
	  	double res3=Math.max(d1, d2);
	  	double res4=Math.max(d1, d2);
	  	System.out.println("maximum of "+i1+"and"+i2+"is"+res);
		System.out.println("minimum of "+i1+"and"+i2+"is"+res1);
		System.out.println("maximum of "+d1+"and"+d2+"is"+res3);
		System.out.println("minimum of "+d1+"and"+d2+"is"+res4);
	}

}
