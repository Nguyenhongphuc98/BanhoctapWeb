package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTUserAction;

//This should be read-only class.
//So don't add Set method below. Only get method is allowed.
//Only modify data through direct SQL-Query (from phpMyAdmin etc,...).
public interface UserActionImp {
	
	List<BHTUserAction> fetchAllUserActions ();
	
	//Sử dụng %like% để tìm kiếm dễ hơn.
	List<BHTUserAction> fetchUserActionsByName (String actionName);
	
	BHTUserAction fetchUserActionByID (int actionID);
	

}
