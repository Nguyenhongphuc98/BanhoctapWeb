package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Protected_UserPermission")
public class BHTPermission {

	@Id
	@Column(name = "PermissionID")
	int id;
	
	@Column(name = "PermissionName")
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
