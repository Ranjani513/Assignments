package com.Assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationconfigSI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("ShipmentapplicationSI.xml");
ShipmentBOSI shipment=(ShipmentBOSI) context.getBean("shipmentbo");
shipment.displayInfo();
	}

}