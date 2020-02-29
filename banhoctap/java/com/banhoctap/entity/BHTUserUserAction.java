package com.banhoctap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.sun.xml.bind.v2.runtime.Name;

@Entity(name = "UserUserAction")
@IdClass(BHTUserUserActionId.class)
public class BHTUserUserAction {

	@Id
	@Column(name = "UserID")
	int userId;
	
	@Id
	@Column(name = "UserActionID")
	int actionId;
	
	@Id
	@Column(name = "AffectedUserID")
	int affectedUserId;
	
	//=========================================================
	@Column(name = "UserActionDtm ")
	int timeAction;
	
	@Column(name = "UserActionComment")
	int content;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public int getAffectedUserId() {
		return affectedUserId;
	}

	public void setAffectedUserId(int affectedUserId) {
		this.affectedUserId = affectedUserId;
	}

	public int getTimeAction() {
		return timeAction;
	}

	public void setTimeAction(int timeAction) {
		this.timeAction = timeAction;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}
}