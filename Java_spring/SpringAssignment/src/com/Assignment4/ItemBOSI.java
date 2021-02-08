package com.Assignment4;

public class ItemBOSI {
	private int itemCode;
	private String itemName;
	private Double price;

public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

public String toString()
{
	return"itemcode:"+itemCode+"\n"+"ItemName:"+itemName+"\n"+"Price:"+price;
}
}
