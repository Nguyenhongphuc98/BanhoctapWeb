package com.banhoctap.dalimp;

import java.sql.Timestamp;
import java.util.List;

import com.banhoctap.entity.BHTUserCommentAction;

public interface UserCommentActionImp {
	
	boolean saveUserCommentAction (BHTUserCommentAction userCommentAction);
	
	boolean deleteUserCommentAction (BHTUserCommentAction userCommentAction);
	
	List<BHTUserCommentAction> fetchUserCommentActions();
	
	//Filter nào không có thì ta truyền null vào. Trong hàm sẽ tự động xem là không dùng filter đó.
	List<BHTUserCommentAction> fetchUserCommentActionsWithFilter(Integer userID, Integer commentActionID, 
			Integer commentID, Timestamp commentActionDtm, String commentActionComment);
	
}
