package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "DocumentCategory")
public class BHTDocumentCategory {

	@Id
	@Column(name = "DocumentCategoryID")
	int id;
	
	@Column(name = "DocumentCategoryName")
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
