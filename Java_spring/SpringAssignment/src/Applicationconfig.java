import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Assignment4.ShipmentBO;

public class Applicationconfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("Shipmentapplication.xml");
ShipmentBO shipment=(ShipmentBO) context.getBean("shipmentbo");
shipment.displayInfo();
	}

}
