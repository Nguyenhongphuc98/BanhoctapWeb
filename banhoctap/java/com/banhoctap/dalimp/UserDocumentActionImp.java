package com.banhoctap.dalimp;

import java.sql.Timestamp;
import java.util.List;

import com.banhoctap.entity.BHTUserDocumentAction;

public interface UserDocumentActionImp {
	
	boolean saveUserDocumentAction (BHTUserDocumentAction userDocumentAction);
	
	boolean deleteUserDocumentAction (BHTUserDocumentAction userDocumentAction);
	
	List<BHTUserDocumentAction> fetchUserDocumentActions();
	
	//Filter nào không có thì ta truyền null vào. Trong hàm sẽ tự động xem là không dùng filter đó.
	List<BHTUserDocumentAction> fetchUserDocumentActionsWithFilter(Integer userID, Integer documentActionID,
			Integer documentID, Timestamp documentActionDtm, String documentActionComment);
	
}
