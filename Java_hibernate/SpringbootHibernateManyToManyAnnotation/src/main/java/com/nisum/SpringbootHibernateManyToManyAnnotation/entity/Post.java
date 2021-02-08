package com.nisum.SpringbootHibernateManyToManyAnnotation.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name ="posts")
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "title")
private String title;
@Column(name = "content")
private String content;
@Column(name = "postedAt")
private Date postedat=new Date();
@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinTable(name = "post_tags",
joinColumns= {@JoinColumn(name ="post_id")},inverseJoinColumns = {@JoinColumn(name = "tag_id")})
private Set<Tag> tags=new HashSet<>();
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getPostedat() {
	return postedat;
}
public void setPostedat(Date postedat) {
	this.postedat = postedat;
}
public Set<Tag> getTags() {
	return tags;
}
public void setTags(Set<Tag> tags) {
	this.tags = tags;
}
public Post() {
	
	// TODO Auto-generated constructor stub
}
public Post(String title, String content) {

	this.title = title;
	this.content = content;
	
}

}
