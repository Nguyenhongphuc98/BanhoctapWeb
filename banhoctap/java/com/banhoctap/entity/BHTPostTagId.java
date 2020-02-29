package com.banhoctap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class BHTPostTagId implements Serializable{

	@Column(name = "PostID")
	int postId;
	
	@Column(name = "TagID")
	int tagId;
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
