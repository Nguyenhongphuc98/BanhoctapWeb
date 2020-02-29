package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "UserStarredPost")
@IdClass(BHTUserStarredPostId.class)
public class BHTUserStarredPost {

	@Id
	@Column(name = "UserID")
	int userId;
	
	@Id
	@Column(name = "PostID")
	int postID;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}
}
