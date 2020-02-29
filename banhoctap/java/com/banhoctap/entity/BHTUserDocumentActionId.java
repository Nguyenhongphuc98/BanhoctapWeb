package com.banhoctap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BHTUserDocumentActionId implements Serializable{

	@Column(name = "UserID")
	int uid;

	@Column(name = "DocumentActionID")
	int actionId;

	@Column(name = "DocumentID")
	int documentId;
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
