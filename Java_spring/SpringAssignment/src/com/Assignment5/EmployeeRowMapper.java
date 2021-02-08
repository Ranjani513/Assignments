package com.Assignment5;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee employee = new Employee();
		employee.setEmail(rs.getString("email"));
		employee.setEmployeeId(rs.getInt("employeeid"));
		employee.setEmployeeName(rs.getString("employeename"));
		employee.setSalary(rs.getDouble("salary"));
		employee.setGender(rs.getString("gender"));
		return employee;
	}
}
