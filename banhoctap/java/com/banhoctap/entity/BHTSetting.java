package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Protected_Setting")
public class BHTSetting {

	@Id
	@Column(name = "SettingID")
	int id;
	
	@Column(name = "SettingName")
	int name;
	
	@Column(name = "SettingValueOnOff")
	int isEnable;	
	
	@Column(name = "SettingValueNumber")
	int valueNumber;
	
	@Column(name = "SettingValueString")
	String valueString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}

	public int getValueNumber() {
		return valueNumber;
	}

	public void setValueNumber(int valueNumber) {
		this.valueNumber = valueNumber;
	}

	public String getValueString() {
		return valueString;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
	}
}
