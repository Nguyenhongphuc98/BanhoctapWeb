package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "DocumentAction")
public class BHTDocumentAction {

	@Id
	@Column(name = "DocumentActionID")
	int id;
	
	@Column(name = "DocumentActionName")
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
