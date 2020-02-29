package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "BannedWord")
public class BHTBannedWord {

	@Id
	@Column(name = "BannedWordID")
	int id;
	
	@Column(name = "BannedWordContent 	")
	String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
