package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "PostTag")
@IdClass(BHTPostTagId.class)
public class BHTPostTag {

	@Id
	@Column(name = "PostID")
	int postId;
	
	@Id
	@Column(name = "TagID")
	int tagId;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
}
