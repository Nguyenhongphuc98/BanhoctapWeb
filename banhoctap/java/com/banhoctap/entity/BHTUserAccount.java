package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "UserAccount")
public class BHTUserAccount {

	@Id
	@Column(name = "UserID")
	int id;
	
	@Column(name = "UserName")
	String username;
	
	@Column(name = "ProfilePictureURL")
	String avatar;
	
	@Column(name = "Email ")
	String email;
	
	@Column(name = "UserPassword ")
	String password;
	
	@Column(name = "FacebookToken")
	String facebookToken;
	
	@Column(name = "GoogleToken")
	String googleToken;
	
	@Column(name = "PostScore")
	String postScore;
	
	@OneToOne
	@JoinColumn(name = "UserGroupID")
	BHTUserGroup userGroup;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFacebookToken() {
		return facebookToken;
	}

	public void setFacebookToken(String facebookToken) {
		this.facebookToken = facebookToken;
	}

	public String getGoogleToken() {
		return googleToken;
	}

	public void setGoogleToken(String googleToken) {
		this.googleToken = googleToken;
	}

	public String getPostScore() {
		return postScore;
	}

	public void setPostScore(String postScore) {
		this.postScore = postScore;
	}

	public BHTUserGroup getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(BHTUserGroup userGroup) {
		this.userGroup = userGroup;
	}
}
