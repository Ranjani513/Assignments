package com.Assignment5;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDAOImpl implements EmployeeDAO {
private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createEmployee(Employee employee) {
	/*	String SQL ="INSERT INTO employee(employeename,email,gender,salary) VALUES(?,?,?,?)";
		int update = jdbcTemplate.update(SQL, new Object[]{employee.getEmployeeName(),employee.getEmail(),employee.getGender(),employee.getSalary()});
	*/
		int update=jdbcTemplate.update("INSERT INTO employee(employeeid,employeename,email,gender,salary) VALUES(?,?,?,?,?)",
				employee.getEmployeeId(),employee.getEmployeeName(),employee.getEmail(),employee.getGender(),employee.getSalary());
		if(update>0)
			System.out.println("Employee is created...");
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		String SQL="SELECT *FROM employee WHERE employeeid=?";
		Employee employee = (Employee) jdbcTemplate.queryForObject(SQL, new EmployeeRowMapper(), employeeId);
		return employee;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		String SQL="DELETE FROM employee WHERE employeeid=?";
		int update = jdbcTemplate.update(SQL, employeeId);
		if(update>0)
			System.out.println("Employee is deleted..");
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		String SQL="UPDATE employee set email=? WHERE employeeid=?";
		int update = jdbcTemplate.update(SQL, newEmail,employeeId);
		if(update>0)
			System.out.println("Email is updated..");

	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		String SQL="SELECT *FROM employee";
		return  jdbcTemplate.query(SQL, new EmployeeRowMapper());
	}

	
}

