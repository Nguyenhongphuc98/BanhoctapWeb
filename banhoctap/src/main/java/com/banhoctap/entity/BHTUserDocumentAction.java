package com.banhoctap.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "UserDocumentAction")
@IdClass(BHTUserDocumentActionId.class)
public class BHTUserDocumentAction {

	@Id
	@Column(name = "UserID")
	int uid;

	@Id
	@Column(name = "DocumentActionID")
	int actionId;

	@Id
	@Column(name = "DocumentID")
	int documentId;

	// ------------------------------
	@Column(name = "DocumentActionDtm")
	Date date;

	@Column(name = "DocumentActionComment")
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

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
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
