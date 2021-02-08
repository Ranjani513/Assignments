package com.nisum.Employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      EmployeeJDBCTemplate employeeJDBCTemplate = 
	         (EmployeeJDBCTemplate)context.getBean("EmployeeJDBCTemplate");
	      
	      System.out.println("------Records Creation--------" );
	      employeeJDBCTemplate.create("Ranjani", 20);
	      employeeJDBCTemplate.create("mamatha", 21);
	      employeeJDBCTemplate.create("vasavi", 19);

	      System.out.println("------Listing Multiple Records--------" );
	      List<Employee> employees = employeeJDBCTemplate.listEmployees();
	      
	      for (Employee record : employees) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      System.out.println("----Updating Record with ID = 2 -----" );
	      employeeJDBCTemplate.update(2, 20);

	      System.out.println("----Listing Record with ID = 2 -----" );
	      Employee emp = employeeJDBCTemplate.getEmployee(2);
	      System.out.print("ID : " + emp.getId() );
	      System.out.print(", Name : " + emp.getName() );
	      System.out.println(", Age : " + emp.getAge());
	}

}
