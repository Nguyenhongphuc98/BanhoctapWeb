package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Protected_PostAction")
public class BHTPostAction {

	@Id
	@Column(name = "PostActionID")
	int id;
	
	@Column(name = "PostActionName")
	int name;
}
