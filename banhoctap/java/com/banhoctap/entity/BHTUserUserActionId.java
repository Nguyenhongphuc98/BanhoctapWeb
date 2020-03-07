package com.banhoctap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BHTUserUserActionId implements Serializable{

	@Column(name = "UserID")
	int userId;
	
	@Column(name = "UserActionID")
	int actionId;
	
	@Column(name = "AffectedUserID")
	int affectedUserId;
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
