package com.app.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;



@MappedSuperclass // to tell hib , not to create any tables n other entities will extend from it

public class BaseEntity {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BaseEntity() {
		
		// TODO Auto-generated constructor stub
	}	
	
	
	
}