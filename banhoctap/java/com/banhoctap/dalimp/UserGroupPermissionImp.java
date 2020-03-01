package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTUserGroupPermission;

public interface UserGroupPermissionImp {
	
	//Không cho update vì bản thân ở bảng này có 2 trường, và cả 2 tạo thành khoá chính.
	boolean insertUserGroupPermission (BHTUserGroupPermission userGroupPermission);
	
	boolean deleteUserGroupPermission (BHTUserGroupPermission userGroupPermission);
	
	List<BHTUserGroupPermission> fetchAllPermissionOfUserGroup (int userGroupID);
	
}
