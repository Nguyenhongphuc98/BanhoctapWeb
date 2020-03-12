package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTPostAction;

//This should be read-only class.
//So don't add Set method below. Only get method is allowed.
//Only modify data through direct SQL-Query (from phpMyAdmin etc,...).
public interface PostActionImp {

	List<BHTPostAction> fetchAllPostActions();
	
	//Sử dụng %like% để tìm kiếm dễ hơn.
	List<BHTPostAction> fetchPostActionsByName (String postActionName);
	
	BHTPostAction fetchPostActionsByID (int postActionID);
	
}
