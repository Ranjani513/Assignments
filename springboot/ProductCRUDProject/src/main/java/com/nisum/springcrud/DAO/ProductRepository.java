package com.nisum.springcrud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nisum.springcrud.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
public abstract Product findByName(String name);
}
