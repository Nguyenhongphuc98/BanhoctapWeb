package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTCommentAction;

//This should be read-only class.
//So don't add Set method below. Only get method is allowed.
//Only modify data through direct SQL-Query (from phpMyAdmin etc,...).
public interface CommentActionImp {

	List<BHTCommentAction> fetchCommentActions ();
	
	List<BHTCommentAction> fetchCommentActionsByName (String commentActionName);
	
	BHTCommentAction fetchCommentActionsByID (int commentActionID);
	
}
