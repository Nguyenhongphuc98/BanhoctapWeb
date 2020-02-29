package com.banhoctap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BHTUserCommentActionId implements Serializable{
	
	@Column(name = "UserID")
	int uid;
	
	@Column(name = "CommentActionID")
	int actionId;
	
	@Column(name = "CommentID")
	int commentId;
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
