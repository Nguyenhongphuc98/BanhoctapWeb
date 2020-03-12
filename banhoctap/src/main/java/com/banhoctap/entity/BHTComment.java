package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "Comment")
public class BHTComment {

	@Id
	@Column(name = "CommentID")
	int cmtId;
	
	@OneToOne
	@JoinColumn(name = "UserID")
	BHTUserAccount user;
	
	@OneToOne
	@JoinColumn(name = "PostID")
	BHTPost post;
	
	@Column(name = "CommentSoftDeleted")
	boolean isSoftDeleted;
	
	@Column(name = "CommentHidden ")
	boolean isHidden;
	
	@Column(name = "CommentApproved")
	boolean isApproved;
	
	@Column(name = "CommentContentURL")
	String content;
	
	@OneToOne
	@JoinColumn(name = "ParentCommentID")
	BHTComment commentParent;
	
	@Column(name = "CommentDtm")
	int cmtTime;

	public int getCmtId() {
		return cmtId;
	}

	public void setCmtId(int cmtId) {
		this.cmtId = cmtId;
	}

	public BHTUserAccount getUser() {
		return user;
	}

	public void setUser(BHTUserAccount user) {
		this.user = user;
	}

	public BHTPost getPost() {
		return post;
	}

	public void setPost(BHTPost post) {
		this.post = post;
	}

	public BHTComment getCommentParent() {
		return commentParent;
	}

	public void setCommentParent(BHTComment commentParent) {
		this.commentParent = commentParent;
	}

	public boolean isSoftDeleted() {
		return isSoftDeleted;
	}

	public void setSoftDeleted(boolean isSoftDeleted) {
		this.isSoftDeleted = isSoftDeleted;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCmtTime() {
		return cmtTime;
	}

	public void setCmtTime(int cmtTime) {
		this.cmtTime = cmtTime;
	}
}
