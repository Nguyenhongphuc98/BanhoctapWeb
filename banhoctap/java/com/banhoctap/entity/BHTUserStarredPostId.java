package com.banhoctap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class BHTUserStarredPostId implements Serializable{

	@Column(name = "UserID")
	int userId;
	
	@Column(name = "PostID")
	int postID;
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
