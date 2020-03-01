package com.banhoctap.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NaturalId;

@Entity(name = "Post")
public class BHTPost {
	
	@Id
	@Column(name = "PostID")
	int id;
	
	@Column(name = "PostTitle")
	String title;
	
	@NaturalId
	@Column(name = "PostPublicURL", nullable = true)
	String URL;
	
	@Column(name = "PostContentURL")
	String contentURL;
	
	@Column(name = "PostSubmitDtm")
	Date submitDtm;
	
	@Column(name = "PostPublishDtm")
	Date publishDtm;
	
	@Column(name = "PostReadTime")
	int readTime;
	
	@Column(name = "NumVote")
	int numVote;
	
	@Column(name = "NumView")
	int numView;
	
	@Column(name = "PostSoftDeleted")
	boolean softDeleted;
	
	@Column(name = "PostHidden")
	boolean isHidden;
	
	@Column(name = "PostApproved")
	boolean isApproved;
	
//	@Column(name = "PosterUserID")
//	int userId;
//	
//	@Column(name = "PostCategoryID")
//	int categoryId;
	
	@OneToOne()
	@JoinColumn(name = "PosterUserID")
	BHTUserAccount author;
	
	@OneToOne
	@JoinColumn(name = "PostCategoryID")
	BHTPostCategory category;
	
	public BHTPost() {
		super();
		author = new BHTUserAccount();
		category = new BHTPostCategory();
	}


	public void bind(PostInterface post) {
		this.title = post.getTitle();
		this.contentURL = post.getContentURL();
		this.category.id = post.getCategoryID();
		
		this.readTime = 0;
		this.submitDtm = Date.valueOf(LocalDate.now());
		//=== vv
	}

	
	//get and set method===================================================================================
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getContentURL() {
		return contentURL;
	}

	public void setContentURL(String contentURL) {
		this.contentURL = contentURL;
	}

	public Date getSubmitDtm() {
		return submitDtm;
	}

	public void setSubmitDtm(Date submitDtm) {
		this.submitDtm = submitDtm;
	}

	public Date getPublishDtm() {
		return publishDtm;
	}

	public void setPublishDtm(Date publishDtm) {
		this.publishDtm = publishDtm;
	}

	public int getReadTime() {
		return readTime;
	}

	public void setReadTime(int readTime) {
		this.readTime = readTime;
	}

	public int getNumVote() {
		return numVote;
	}

	public void setNumVote(int numVote) {
		this.numVote = numVote;
	}

	public int getNumView() {
		return numView;
	}

	public void setNumView(int numView) {
		this.numView = numView;
	}

	public boolean isSoftDeleted() {
		return softDeleted;
	}

	public void setSoftDeleted(boolean softDeleted) {
		this.softDeleted = softDeleted;
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


	public BHTUserAccount getAuthor() {
		return author;
	}


	public void setAuthor(BHTUserAccount author) {
		this.author = author;
	}


	public BHTPostCategory getCategory() {
		return category;
	}


	public void setCategory(BHTPostCategory category) {
		this.category = category;
	}


//	public int getUserId() {
//		return userId;
//	}
//
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//
//	public int getCategoryId() {
//		return categoryId;
//	}
//
//
//	public void setCategoryId(int categoryId) {
//		this.categoryId = categoryId;
//	}
	

}
