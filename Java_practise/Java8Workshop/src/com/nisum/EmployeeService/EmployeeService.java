package com.nisum.EmployeeService;

import com.nisum.Employee.Employee;

public interface EmployeeService {
 public void createEmployee(Employee emp);
 public void UpdateEmployee(int id,Employee emp);
 public void DeleteEmployee(int id);
 public void getALlEmployees();
 public void getNumberOfEmpInParticularCity();
}
