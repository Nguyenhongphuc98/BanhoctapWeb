package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "UserPostScoreRating")
public class BHTUserPostScoreRating {

	@Id
	@Column(name = "UserPostScoreRatingID")
	int id;
	
	@OneToOne
	@JoinColumn(name = "UserID")
	BHTUserAccount user;
	
	@Column(name = "UserName")
	int username;
	
	@Column(name = "UserScore")
	int score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BHTUserAccount getUser() {
		return user;
	}

	public void setUser(BHTUserAccount user) {
		this.user = user;
	}

	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
