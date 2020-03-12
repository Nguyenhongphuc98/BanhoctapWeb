package com.banhoctap.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "UserCommentAction")
@IdClass(BHTUserCommentActionId.class)
public class BHTUserCommentAction {

	@Id
	@Column(name = "UserID")
	int uid;
	
	@Id
	@Column(name = "CommentActionID")
	int actionId;
	
	@Id
	@Column(name = "CommentID")
	int commentId;
	
	//------------------------------
	@Column(name = "CommentActionDtm")
	Date date;
	
	@Column(name = "CommentActionComment")
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

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
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
