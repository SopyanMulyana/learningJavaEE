package com.example.learnthumeleaf.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String message;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	public Post(String message) {
		this.message = message;
	}

	public long getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
