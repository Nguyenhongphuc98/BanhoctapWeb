package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTUserAccount;

public interface UserAccountImp {
	
	boolean saveUserAccount (BHTUserAccount userAccount);
	
	//We should only soft-delete (that is, mark user account as deleted only and not physically deleted)
	//Since the fact that we must retain user information to display as an author of posts, documents,...
	boolean deleteUserAccount (BHTUserAccount userAccount);
	
	boolean deleteUserAcccount(int userID);
	
	BHTUserAccount fetchUserAccount (int userID);
	
	List<BHTUserAccount> fetchAllUserAccounts ();
	
	//Using SQL like statement for better matching result.
	List<BHTUserAccount> fetchUserAccountByName(String userName);
	
	//Luôn luôn sanitize input data của User ngay lập tức khi User submit trước khi làm bất kỳ thứ gì với nó.
	boolean authenticateUserAccount (BHTUserAccount userAccount);

}
