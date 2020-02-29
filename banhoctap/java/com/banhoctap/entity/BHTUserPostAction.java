package com.banhoctap.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "UserPostAction")
@IdClass(BHTUserPostActionId.class)
public class BHTUserPostAction {

	// primarykey
	@Id
	@Column(name = "UserID")
	int uid;

	@Id
	@Column(name = "PostActionID")
	int actionId;

	@Id
	@Column(name = "PostID")
	int postId;

	// ------------------------------
	@Column(name = "PostActionDtm")
	Date date;

	@Column(name = "PostActionComment")
	String content;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
