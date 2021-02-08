package demo;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="zyx";
   String res="";
   int d=0;
   int g=0;
   for(int i=0;i<s.length();i++)
   {
	   
	   
	    d=s.charAt(i)+2;
	   
	   if(d>65 && d<91 || d>97 && d<123 ) {
	       res=res+(char)d;
   }
	   else
	   {
		   g=d-26;
		   res=res+(char)g;
		   
	   }
	   System.out.println(res);
   }

	}

}
