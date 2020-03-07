package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTDocumentCategory;

public interface DocumentCategoryImp {

	boolean saveDocumentCategory(BHTDocumentCategory documentCategory);
	
	boolean deleteDocumentCategory(BHTDocumentCategory documentCategory);
	
	List<BHTDocumentCategory> fetchDocumentCategories();
	
}
