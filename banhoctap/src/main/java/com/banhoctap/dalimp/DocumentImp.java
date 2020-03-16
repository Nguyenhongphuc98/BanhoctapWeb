package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTDocument;

public interface DocumentImp {

	boolean saveDocument (BHTDocument document);
	
	boolean deleteDocument (BHTDocument document);
	
	List<BHTDocument> fetchDocuments();
	
	List<BHTDocument> fetchDocumentsByTitle(String documentTitle);
	
	List<BHTDocument> fetchDocumentsByDescription(String documentDescription);
	
	List<BHTDocument> fetchDocumentsTopNDownload(int topN);
	
	//Filter nào không có thì ta truyền null vào. Trong hàm sẽ tự động xem là không dùng filter đó.
	List<BHTDocument> fetchDocumentsByFilter (Integer documentID, String documentTitle, 
			String documentDescription, Integer documentUploaderUserID, String documentContentURL,
			Boolean documentSoftDeleted, Boolean documentHidden, Boolean documentApproved,
			Long documentViewCount, Long documentDownloadCount, Integer semesterID, Integer subjectID,
			Integer documentCategoryID);
}
