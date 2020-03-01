package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTUserStarredPost;

public interface UserStarredPostImp {
	
	//Không có phương thức save vì không có khả năng thay đổi (update) giá trị.
	//Lý do là user chỉ có thể thích (hoặc không thích) một bài post mà thôi.
	//Nên chỉ có thêm và xoá.
	
	boolean insertUserStarredPost(BHTUserStarredPost userStarredPost);
	
	boolean deleteUserStarredPost(BHTUserStarredPost userStarredPostImp);
	
	List<BHTUserStarredPost> fetchAllPostStarredByUser(int userID);
	
	List<BHTUserStarredPost> fetchAllUserStarredThePost(int postID);
	
}
