package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTDocumentAction;

//This should be read-only class.
//So don't add Set method below. Only get method is allowed.
//Only modify data through direct SQL-Query (from phpMyAdmin etc,...).
public interface DocumentActionImp {

	List<BHTDocumentAction> fetchDocumentActions();
	
	List<BHTDocumentAction> fetchDocumentActionsByName (String documentName);
	
	BHTDocumentAction fetchDocumentActionsByID (int documentActionID);
	
}
