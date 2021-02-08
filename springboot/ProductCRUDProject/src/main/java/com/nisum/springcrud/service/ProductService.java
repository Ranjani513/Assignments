package com.nisum.springcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.springcrud.DAO.ProductRepository;
import com.nisum.springcrud.model.Product;

@Service
public class ProductService {
@Autowired
private ProductRepository repository;

public List<Product> ListAll()
{
	return repository.findAll();
}
public void save(Product product)
{
	
	repository.save(product);
}
public Product getById(Integer id)
{
	//return repository.findById(id).get();
	
	  Optional<Product> findbyid= repository.findById(id); if(findbyid.isPresent())
	  { return findbyid.get(); } else { System.out.
	  println("Sorry please enter the vaild id which you entered is not present");
	  } return null;
	 
}
public void delete(Integer id)
{
	
	repository.deleteById(id);
}

  public Product FindByName(String name) { List<Product>
  prod=repository.findAll(); Product product1 = prod.stream() .filter(prod1 ->
  name.equals(prod1.getName())) .findAny() .orElse(null); return product1;
  
  }
 
}
