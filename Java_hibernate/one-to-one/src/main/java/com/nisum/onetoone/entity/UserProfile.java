package com.nisum.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_profiles")
public class UserProfile<User> {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name ="Address")
private String Address;
@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "userprofile")
private User1 user;
public User1 getUser() {
	return user;
}
public void setUser(User1 user) {
	this.user = user;
}

public UserProfile(long id, String address, User1 user) {
	super();

	Address = address;
	this.user = user;
}
public UserProfile() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

}
