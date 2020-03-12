package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTUserPermission;

//This should be read-only class.
//So don't add Set method below. Only get method is allowed.
//Only modify data through direct SQL-Query (from phpMyAdmin etc,...).
public interface UserPermissionImp {

	List<BHTUserPermission> fetchAllUserPermissions();
	
	//Sử dụng %like% để tìm kiếm dễ hơn.
	List<BHTUserPermission> fetchUserPermissionsByName (String permissionName);
	
	BHTUserPermission fetchUserPermissionsByID (int permissionID);
	
}
