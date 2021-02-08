/*1) Build List of Order objects having properties [ id, status ] as below and then filter out and return list of orders whose status are 'PENDING';.
		condition : Use java for each.
		input :
			order [ "O345" , "COMPLETED" ]
			order [ "O456" , "COMPLETED" ]
			order [ "O789" , "IN-TRNASIT" ]
			order [ "O346" , "PENDING" ]
			order [ "O347" , "PENDING" ]
			order [ "O348" , "CANCELLED" ]
			order [ "O678" , "PENDING" ]

		output :
			order [ "O346" , "PENDING" ]
			order [ "O347" , "PENDING" ]
			order [ "O678" , "PENDING" ]
*/
package Ass4;

import java.util.ArrayList;

public class Order {
String id;
String status;
static ArrayList<Order> a=new ArrayList<>();
Order(String id,String status)
{
	this.id=id;
	this.status=status;
}
public String toString()
{
	return "["+id+","+status+"]";
}
public static  void filter(ArrayList<Order> al)
{
	for(Order o:al)
	{
		if((o.status).equals("PENDING"))
		{
			System.out.println(o);
		}
	}
}

public static void main(String[] args)
{
	ArrayList<Order> a=new ArrayList<>();

a.add(new	Order ( "O345" , "COMPLETED" ));
a.add(new Order( "O456" , "COMPLETED" ));
a.add(new Order("O789" , "IN-TRNASIT" ));
a.add(new Order( "O346" , "PENDING" ));
a.add(new Order("O347" , "PENDING" ));
a.add(new Order( "O348" , "CANCELLED" ));
a.add(new Order( "O678" , "PENDING" ));
Order.filter(a);
}

}
