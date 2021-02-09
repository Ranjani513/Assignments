package com.nisum.EmployeeRESTClient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.EmployeeRESTClient.model.Employee;
import com.nisum.EmployeeRESTClient.service.EmployeeClientService;

@RestController
@RequestMapping("/employee-client")
public class EmployeeClientController {
	@Autowired
	private EmployeeClientService empservice;
    @PostMapping
	public String saveEmployee(@RequestBody Employee employee) {
		return empservice.saveEmp(employee);
		
	}
    @GetMapping
    public List<Employee> getAllEmployees()
    {
    	return empservice.getAllEmp();
    }
    @PutMapping
    public String updateEmp(@RequestBody Employee employee)
    {
    	return empservice.updateEmployee(employee);
    }
    @DeleteMapping("/{empid}")
    public  void deleteEmp(@PathVariable("empid") int id)
    {
    	empservice.deleteEmployee(id);
    }

}
