package com.Assignment4;

import java.util.List;

public class ShipmentBO {
	private String shipmentId;
	private ContactBO contactBO;
	private List<ItemBO> itemBOs;
	private List<AddressBO> addressBOs;
	private String shipmentStatus;
	ShipmentBO(String shipmentId,ContactBO contactBO,List<ItemBO> itemBOs,List<AddressBO> addressBOs, String shipmentStatus)
	{
		this.addressBOs=addressBOs;
		this.contactBO=contactBO;
		this.itemBOs=itemBOs;
		this.shipmentId=shipmentId;
		this.shipmentStatus=shipmentStatus;
	}
	public void displayInfo()
	{
		System.out.println("ShipmentId:"+shipmentId+"\t"+"shipmentstatus:"+shipmentStatus);
		contactBO.displaycontact();
		for(ItemBO item:itemBOs)
		{
			System.out.println("Items list:"+item);
		}
		for(AddressBO address:addressBOs)
		{
			System.out.println("Address:"+address);
		}
	}
}
