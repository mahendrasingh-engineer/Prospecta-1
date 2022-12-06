package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entry {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
  
  private String title;
  
  private String description;
  
  private String category;

	public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

	@Override
	public String toString() {
		return "Entry [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	public Entry(String title,String category, String description) {
		super();
		this.title = title;
		this.description = description;
		this.category=category;
	}
	
	public Entry() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	  
	  
  
}
