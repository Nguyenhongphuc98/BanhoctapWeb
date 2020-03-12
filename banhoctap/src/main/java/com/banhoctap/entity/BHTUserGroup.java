package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "UserGroup")
public class BHTUserGroup {

	@Id
	@Column(name = "UserGroupID")
	int id;
	
	@Column(name = "UserGroupName")
	int name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
}
