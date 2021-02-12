package com.nisum.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name ="up_id")
	private UserProfile userprofile;
	
	

	public User1() {
		
		// TODO Auto-generated constructor stub
	}



	public User1(long id, String name, UserProfile userprofile) {
		super();
		this.id = id;
		this.name = name;
		this.userprofile = userprofile;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public UserProfile getUserprofile() {
		return userprofile;
	}



	public void setUserprofile(UserProfile userprofile) {
		this.userprofile = userprofile;
	}
	
}