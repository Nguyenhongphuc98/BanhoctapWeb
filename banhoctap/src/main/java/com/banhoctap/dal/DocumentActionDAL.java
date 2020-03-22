package com.banhoctap.dal;

import java.util.List;

import javax.transaction.Transactional;

import com.banhoctap.dalimp.DocumentActionImp;
import com.banhoctap.entity.BHTDocumentAction;
import com.banhoctap.entity.BHTDocumentCategory;

public class DocumentActionDAL extends DataAccessLayer implements DocumentActionImp {

	@Override
	@Transactional
	public List<BHTDocumentAction> fetchDocumentActions() {
		String query = "from DocumentAction ";
		List<BHTDocumentAction> documentactions = null;
		
		documentactions = (List<BHTDocumentAction>) getSession().createQuery(query).getResultList();
		
		if (documentactions == null)
		{
			System.out.println("can't load any document action");
			return null;
		}
		return documentactions;
	}

	@Override
	@Transactional
	public List<BHTDocumentAction> fetchDocumentActionsByName(String documentActionName) {
		String query = "from DocumentAction where DocumentActionName = " + documentActionName;
		List<BHTDocumentAction> documentactions = null;
		
		documentactions = (List<BHTDocumentAction>) getSession().createQuery(query).getResultList();
		
		if (documentactions == null)
		{
			System.out.println("can't load any document action");
			return null;
		}
		return documentactions;
	}

	@Override
	@Transactional
	public BHTDocumentAction fetchDocumentActionsByID(int documentActionID) {
		String query = "from DocumentAction where DocumentActionID = " + documentActionID;
		BHTDocumentAction documentaction = null;
		
		documentaction =  (BHTDocumentAction) getSession().createQuery(query).getSingleResult();
		
		if (documentaction == null)
		{
			System.out.println("can't load document action of : ID-"+documentActionID);
			return null;
		}
		return documentaction;
	}

}
