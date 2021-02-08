//1) Write a program to display first five product objects whose prices are less than 10$ using For Loop.
	//Product[ id, name, price]
package Ass4;

public class A1_1 {
String name;
int id;
double price;
A1_1(String name,int id,double price)
{
	this.name=name;
	this.id=id;
	this.price=price;
}
public String toString()
{
	return name+"\t"+id+"\t"+price;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
      A1_1 a1=new A1_1("Ranjani",1,12);
      A1_1 a2=new A1_1("ramya",2,34.66);
      A1_1 a3=new A1_1("sushma",3,9);
      A1_1 a4=new A1_1("akhila",4,7);
      A1_1 a5=new A1_1("komala",5,11);
      A1_1 a6=new A1_1("bala",6,9);
      A1_1 a7=new A1_1("sruthi",7,1);
      A1_1 a8=new A1_1("manasa",8,5);
      A1_1 a[]= {a1,a2,a3,a4,a5,a6,a7,a8};
     for(int i=0;i<8;i++)
      {
    	
      
    	  if(a[i].price<10 && count<=5)
    	  {
    		  System.out.println(a[i]);
    		  count++;
    	  }
    	  
      }
	}
	
}
