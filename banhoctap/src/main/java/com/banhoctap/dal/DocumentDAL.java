package com.banhoctap.dal;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.banhoctap.dalimp.DocumentImp;
import com.banhoctap.entity.BHTDocument;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DocumentDAL implements DocumentImp {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
			System.out.println("current");
		} catch (Exception e) {
			System.out.println("new");
			session = sessionFactory.openSession();
		}
		
		return session;
	}
	
	@Override
	public boolean saveDocument(BHTDocument document) {
		
		int key = (Integer) getSession().save(document);
		if (key != 0)
			return true;

		return false;
	}

	@Override
	public boolean deleteDocument(BHTDocument document) {
		
		return false;
	}

	@Override
	@Transactional
	public List<BHTDocument> fetchDocuments() {
		
		String query = "from Document ";
		List<BHTDocument> documents = null;
		
		documents = (List<BHTDocument>) getSession().createQuery(query).getResultList();
		
		if (documents == null)
		{
			System.out.println("can't load any document");
			return null;
		}
		return documents;
	}

	@Override
	@Transactional
	public List<BHTDocument> fetchDocumentsByTitle(String documentTitle) {

		String query = "from Document where DocumentHidden = 0 and DocumentApproved = 1 and DocumentTitle like '%"+ documentTitle + "%'";
		List<BHTDocument> documents = null;
		
		documents = (List<BHTDocument>) getSession().createQuery(query).getResultList();
		
		if (documents == null)
		{
			System.out.println("can't load any document");
			return null;
		}
		return documents;
	}

	@Override
	@Transactional
	public List<BHTDocument> fetchDocumentsByDescription(String documentDescription) {

		String query = "from Document where DocumentHidden = 0 and DocumentApproved = 1 and DocumentDescription like '%"+ documentDescription + "%'";
		List<BHTDocument> documents = null;
		
		documents = (List<BHTDocument>) getSession().createQuery(query).getResultList();
		
		if (documents == null)
		{
			System.out.println("can't load any document");
			return null;
		}
		return documents;
	}

	@Override
	@Transactional
	public List<BHTDocument> fetchDocumentsTopNDownload(int topN) {
		String query = "from Document where DocumentHidden = 0 and DocumentApproved = 1 ORDER BY DocumentDownloadCount DESC";
		List<BHTDocument> documents = null;
		
		documents = (List<BHTDocument>) getSession().createQuery(query).setMaxResults(topN).getResultList();
		
		if (documents == null)
		{
			System.out.println("can't load any document");
			return null;
		}
		return documents;
	}
	
	@Override
	public List<BHTDocument> fetchDocumentsByFilter(Integer documentID, String documentTitle,
			String documentDescription, Integer documentUploaderUserID, String documentContentURL,
			Boolean documentSoftDeleted, Boolean documentHidden, Boolean documentApproved, Long documentViewCount,
			Long documentDownloadCount, Integer semesterID, Integer subjectID, Integer documentCategoryID) {
		
		return null;
	}

}
