/*Using Arrays, categorize the list of products as below.(Use Inheritance, constructors, access modifiers(private & public))

	Home(a.1 Furniture, a.2 Kitchen).

	Fashion(b.1 Men(b.1.1 Dresses, b.1.2 Footwear), b.2 Women(b.2.1 Dresses, b.2.2 Footwear), b.3 Children(b.3.1 Dresses, b.3.2 Footwear)).

	Jewellery(c.1 Chains, c.2 Tops).

    Use parent class ‘Category’ with subclasses ‘Home’,Fashion’ & ‘Jewellery’*/
package com.Ass2;

import java.util.Scanner;

public class Category {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Main Menu-----------");
		Jewellary j=new Jewellary();
		j.displaylist();
		System.out.println("Enter 1.for Home catalog  or  2.for fashion  or 3.for jewellary or 4 for exit");
		int item=sc.nextInt();
		switch(item)
		{
		case 1:
			j.displayhome();
			break;
		case 2: 
			j.displayFashion();
			System.out.println("Enter 1.for Men  or  2.Women  or 3.for children");
			int select=sc.nextInt();
			if(select==1)
			{
				j.displayMen();
			}
			else if(select==2)
			{
				j.displayWomen();
			}
			else if(select==3)
			{
				j.displayChildren();
			}
			else
			{
				System.out.println("Enter the correct number between 1 to 3");
			}
		
			break;
		case 3:
			j.displayjewel();
			break;
		 default:
			 System.out.println("Thanks for visiting");
			 break;
		}
		System.out.println("Thanks for visiting");
		
	}

}
class Catalog extends Category
{
	Catalog()
	{
		
	}
	String catalog[]= {"Home","Fashion","Jewellery"};
	public void displaylist()
	{
		System.out.println("----------------Displaying the list of items----------------------");
		for(int i=0;i<catalog.length;i++)
		{
			System.out.println(catalog[i]);
		}
	}
}
class Home extends Catalog
{
	String home[]= {"1.Furniture","2.Kitchen"};
	public void displayhome()
	{
		System.out.println("----------------Displaying the list of Home items----------------------");
		for(int i=0;i<home.length;i++)
		{
			System.out.println(home[i]);
		}
	}
	
}
class Fashion extends Home
{
	String Fashion[]= {"1.Men","2.Women","3.children"};
	String Men[]= {"1.Dresses","2.Footwear"};
	String Women[]= {"1.Dresses","2.Footwear"};
	String children[]= {"1.Dresses","2.Footwear"};
	public void displayFashion()
	{
		System.out.println("----------------Displaying the list of Home items----------------------");
		for(int i=0;i<Fashion.length;i++)
		{
			System.out.println(Fashion[i]);
		}
	}
	public void displayMen()
	{
		System.out.println("----------------Displaying the list of Men items----------------------");
		for(int i=0;i<Men.length;i++)
		{
			System.out.println(Men[i]);
		}
	}
	public void displayWomen()
	{
		System.out.println("----------------Displaying the list of Women items----------------------");
		for(int i=0;i<Women.length;i++)
		{
			System.out.println(Women[i]);
		}
	}
	public void displayChildren()
	{
		System.out.println("----------------Displaying the list of children items----------------------");
		for(int i=0;i<children.length;i++)
		{
			System.out.println(children[i]);
		}
	}
	
	
}
class Jewellary extends Fashion
{
	String jewel[]= {"1.chains","2.Tops"};
	public void displayjewel()
	{
		System.out.println("----------------Displaying the list of jewellery items----------------------");
		for(int i=0;i<jewel.length;i++)
		{
			System.out.println(jewel[i]);
		}

		
	}
}

