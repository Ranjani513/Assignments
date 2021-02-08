package com.Assignment4;

public class ItemBO {
	private int itemCode;
	private String itemName;
	private Double price;
public ItemBO(int itemCode,String itemName,Double price)
{
	super();
	this.itemCode=itemCode;
	this.itemName=itemName;
	this.price=price;
	
}
public String toString()
{
	return"itemcode:"+itemCode+"\n"+"ItemName:"+itemName+"\n"+"Price:"+price;
}
}
