package com.nisum;

public class A25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,rem=0,sum=0,c;
		int n=11;
   outer:
	   while(n>10) {
		  c=n;
	      sum=0;
			   while(c!=0)
			   {
				   rem=c%10;
				   sum=sum+(rem*rem*rem);
				   c/=10;
			   }
			     
			 		  if(n==sum)
		  {
			        count++;
			        System.out.println(n);
			        System.out.println(count);
			        
		  }
			 		  if(count>10) {
		 
			 			 break outer;
	   }
		 
		  n++;
		  
	
	   }
	}

}
