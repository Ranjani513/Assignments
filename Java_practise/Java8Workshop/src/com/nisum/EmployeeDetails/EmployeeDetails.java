package com.nisum.EmployeeDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.nisum.Employee.Employee;
import com.nisum.EmployeeService.EmployeeService;

public class EmployeeDetails implements EmployeeService {
	public static List<Employee> list = new ArrayList<Employee>();

	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub

		long presentid = list.stream().filter(ee -> ee.getId() == emp.getId()).count();
		if (presentid == 0) {
			list.add(emp);
			System.out.println("Successfully created the Employee");
		} else {
			System.out.println("entered Id is already present enter the another Id");
		}

	}

	@Override
	public void UpdateEmployee(int id, Employee emp) {
		// TODO Auto-generated method stub
		long c = 0;
		c = list.stream().filter(e -> e.getId() == id).count();
		if (c != 0) {
			list.stream().filter(e -> e.getId() == id).forEach(e -> {
				e.setId(emp.getId());
				e.setName(emp.getName());
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println(
						"Updated Employee at id:" + id + "\n" + " name:" + e.getName() + "\t" + "id:" + e.getId());
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			});
		}

		else {
			System.out.println("**************entered Id is not present!!*********************" + "\n"
					+ " If you want to create new Employee y/n");
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			if (ch == 'y') {
				list.add(emp);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("New Employee Created Successfully" + "\n" + "name:" + emp.getName() + "\t" + "id:"
						+ emp.getId());
				System.out
						.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			} else {
				System.out.println("enter the valid Id");
			}
		}

	}

	@Override
	public void DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		long p = 0;
		p = list.stream().filter(e -> e.getId() == id).count();
		if (p != 0) {
			List<Employee> em = list.stream().filter(e -> e.getId() == id).collect(Collectors.toList());
			em.stream().forEach(list::remove);
			System.out.println("Deleted Successfully");
		} else {
			System.out.println("entered id is not present" + "\n" + "It contains these id's select from them");
			list.stream().forEach(e -> System.out.println(e.getId()));
		}
	}

	@Override
	public void getALlEmployees() {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("name" + "\t" + "\t" + "id");
		list.stream().forEach(e -> System.out.println(e.getName() + "\t" + "\t" + e.getId()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	@Override
	public void getNumberOfEmpInParticularCity() {
		// TODO Auto-generated method stub
		Map<String, Long> numEmployeesByCity = list.stream()
				.collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
		System.out.println(numEmployeesByCity);
	}

}
