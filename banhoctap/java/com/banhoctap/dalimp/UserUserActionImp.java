package com.banhoctap.dalimp;

import java.sql.Timestamp;
import java.util.List;

import com.banhoctap.entity.BHTUserUserAction;

public interface UserUserActionImp {

	boolean saveUserUserAction (BHTUserUserAction userUserAction);
	
	boolean deleteUserUserAction (BHTUserUserAction userUserAction);
	
	//Filter nào không có thì ta truyền null vào. Trong hàm sẽ tự động xem là không dùng filter đó.
	List<BHTUserUserAction> fetchUserUserActionsWithFilter (int userID, int userActionID, 
			int affectedUserID, Timestamp userActionDtm, String userActionComment);
	
}
