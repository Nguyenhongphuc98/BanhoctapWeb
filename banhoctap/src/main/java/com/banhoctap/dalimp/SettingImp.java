package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTSetting;

//This should be read-only class.
//So don't add Set method below. Only get method is allowed.
//Only modify data through direct SQL-Query (from phpMyAdmin etc,...).
public interface SettingImp {
	
	List<BHTSetting> fetchAllSettings ();
	
	List<BHTSetting> fetchSettingsByName(String settingName);
	
	BHTSetting fetchSettingByID (int settingID);
	
}
