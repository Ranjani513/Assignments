package com.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CART")
public class Cart1 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cart_id")
	private long id;
	
	@Column(name="total")
	private double total;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="cart1")
	private Set<Items1> items1;

	

	public void setItems1(Set<Items1> itemsSet) {
		// TODO Auto-generated method stub
		this.items1=items1;
	}

	public void setTotal(int i) {
		// TODO Auto-generated method stub
		this.total=total;
		
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	
// Getter Setter methods for properties
}
