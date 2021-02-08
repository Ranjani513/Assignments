package com.nisum.Employee;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
	      String SQL = "insert into Employee (name, age) values (?, ?)";
	      jdbcTemplateObject.update( SQL, name, age);
	      System.out.println("Created Record Name = " + name + " Age = " + age);
	      return;
	   }

	@Override
	public Employee getEmployee(Integer id) {
	      String SQL = "select * from Employee where id = ?";
	    Employee employee = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{id}, new EmployeeMapper());
	      
	      return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		String SQL = "select * from Employee";
	      List <Employee> employees = jdbcTemplateObject.query(SQL, new EmployeeMapper());
	      return employees;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String SQL = "delete from Student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String SQL = "update Employee set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	}

}
