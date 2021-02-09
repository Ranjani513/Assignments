package com.nisum.EmployeeRESTClient.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nisum.EmployeeRESTClient.model.Employee;

@Service
public class EmployeeClientService {

	private RestTemplate restTemplate;
	@Autowired
	public EmployeeClientService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate=restTemplateBuilder.build();
	}
 public String saveEmp(Employee employee) {
	 HttpEntity<Employee> entity=new HttpEntity<>(employee);
	return restTemplate.exchange("http://localhost:8080/employee",HttpMethod.POST , entity, String.class).getBody();
	 
 }
 public List<Employee> getAllEmp()
 {
	 return restTemplate.exchange("http://localhost:8080/employee",HttpMethod.GET , null, List.class).getBody();
 }
 public String updateEmployee(Employee employee)
 {
	 HttpEntity<Employee> entity=new HttpEntity<>(employee);
		return restTemplate.exchange("http://localhost:8080/employee",HttpMethod.PUT , entity, String.class).getBody();
 }
 public void deleteEmployee(int id)
 {
	// HttpEntity<Integer> entity=new HttpEntity<>(id);
	// System.out.println(entity);
	 Map<String, Integer> params = new HashMap<String, Integer>();
	    params.put("id", id);
	    restTemplate.delete ("http://localhost:8080/employee/{id}",  params );
		//restTemplate.getForObject("http://localhost:8080/employee/{id}", Integer.class,params);
 }
}
