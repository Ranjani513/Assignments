// 18. Write a Program for unchecked exception example.
package Ass4;

public class A18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=9;
int b=0;
try {
	System.out.println(a/b);
}
catch(Exception e)
{
	System.out.println("RunTime Exception"+e.getMessage());
}
	}

}
