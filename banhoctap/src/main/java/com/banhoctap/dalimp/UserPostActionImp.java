package com.banhoctap.dalimp;

import java.sql.Timestamp;
import java.util.List;

import com.banhoctap.entity.BHTUserPostAction;

public interface UserPostActionImp {

	//Log hành động của người dùng cũng không được edit mà chỉ được thêm/xoá.
	
	boolean insertUserPostAction (BHTUserPostAction userPostAction);
	
	boolean deleteUserPostAction (BHTUserPostAction userPostAction);
	
	List<BHTUserPostAction> fetchUserPostActions ();
	
	//Filter nào không có thì ta truyền null vào. Trong hàm sẽ tự động xem là không dùng filter đó.
	List<BHTUserPostAction> fetchUserPostActionsWithFilter (Integer userID, Integer postActionID, 
			Integer postID, Timestamp postActionDtm, String postActionComment);

}
