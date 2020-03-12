package com.banhoctap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class BHTUserGroupPermissionId implements Serializable{

	@Column(name = "UserGroupID")
	int groupId;
	
	@Column(name = "UserPermissionID")
	int permissionId;
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
