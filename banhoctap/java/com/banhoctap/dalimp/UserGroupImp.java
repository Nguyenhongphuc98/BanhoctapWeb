package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTUserGroup;

public interface UserGroupImp {

	boolean saveUserGroup (BHTUserGroup userGroup);
	
	//Xem xét việc xoá UserGroup trong TH đã có người dùng tồn tại đang thuộc userGroup này.
	boolean deleteUserGroup (BHTUserGroup userGroup);
	
	boolean deleteUserGroup (int userGroupID);
	
	//Using SQL like statement for better matching result.
	List<UserGroupImp> fetchUserGroupByName (String userGroupName);
	
}
