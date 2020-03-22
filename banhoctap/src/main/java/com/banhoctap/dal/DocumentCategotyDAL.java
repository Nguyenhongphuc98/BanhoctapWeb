package com.banhoctap.dal;

import java.util.List;

import javax.transaction.Transactional;

import com.banhoctap.dalimp.DocumentCategoryImp;
import com.banhoctap.entity.BHTDocumentCategory;

public class DocumentCategotyDAL extends DataAccessLayer implements DocumentCategoryImp {

	
	@Override
	@Transactional
	public boolean saveDocumentCategory(BHTDocumentCategory documentCategory) {
		int key = (Integer) getSession().save(documentCategory);
		if (key != 0)
			return true;

		return false;
	}

	@Override
	@Transactional
	public boolean deleteDocumentCategory(BHTDocumentCategory documentCategory) {
		getSession().delete(documentCategory);
		return false;
	}

	@Override
	@Transactional
	public List<BHTDocumentCategory> fetchDocumentCategories() {
		String query = "from DocumentCategory ";
		List<BHTDocumentCategory> documentcategories = null;
		
		documentcategories = (List<BHTDocumentCategory>) getSession().createQuery(query).getResultList();
		
		if (documentcategories == null)
		{
			System.out.println("can't load any document categotis");
			return null;
		}
		return documentcategories;
	}

}
