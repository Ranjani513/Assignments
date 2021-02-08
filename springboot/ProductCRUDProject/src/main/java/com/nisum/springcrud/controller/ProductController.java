package com.nisum.springcrud.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.springcrud.controller.*;
import com.nisum.springcrud.model.Product;
@RestController
public class ProductController {
@Autowired
 com.nisum.springcrud.service.ProductService pservice;
@GetMapping("/products")
public List<Product>getall()
{
	return pservice.ListAll();
}
@GetMapping("/products/{id}")
public ResponseEntity get(@PathVariable Integer id)
{
	//return pservice.getById(id);
	
	  try { Product product=pservice.getById(id);
	  return new ResponseEntity<Product>(product,HttpStatus.OK); }
	  catch(NoSuchElementException e) {
		  return new ResponseEntity<Product>(HttpStatus.NOT_FOUND); }
	 
}


  @GetMapping("/products/name/{name}") public ResponseEntity get(@PathVariable
  String name) {
  
  try { Product product=pservice.FindByName(name); return new
  ResponseEntity<Product>(product,HttpStatus.OK); }
  catch(NoSuchElementException e) { return new
  ResponseEntity<Product>(HttpStatus.NOT_FOUND); }
  
  }
 
@PostMapping("/products")
public void add(Product product) {
pservice.save(product);
}
@PutMapping("/products/{id}")
public void update(@RequestBody Product product ,@PathVariable Integer id)
{
	pservice.save(product);
}
@DeleteMapping("/products/{id}")
public void delete(@PathVariable Integer id)
{
pservice.delete(id);
}
}
