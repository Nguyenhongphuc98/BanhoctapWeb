package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "UserGroupPermission")
@IdClass(BHTUserGroupPermissionId.class)
public class BHTUserGroupPermission {

	@Id
	@Column(name = "UserGroupID")
	int groupId;
	
	@Id
	@Column(name = "UserPermissionID")
	int permissionId;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
}
