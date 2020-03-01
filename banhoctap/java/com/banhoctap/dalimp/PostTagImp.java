package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTPostTag;

public interface PostTagImp {
	
	boolean insertPostTag (BHTPostTag postTag);
	
	boolean deletePostTag (BHTPostTag postTag);
	
	//Lấy tất cả PostTag từ bài post (dù để lấy tag bài post để hiển thị).
	List<BHTPostTag> fetchAllPostTagsByPost (int postID);
	
	//Lấy tất cả PostTag từ một or nhiều tagID (dùng để lấy tất cả bài post của 1 or nhiều tag).
	List<BHTPostTag> fetchAllPostTagsByTags (List<Integer> tagIDs);
	
	//Lấy tất cả PostTag từ một or nhiều tagName.
	List<BHTPostTag> fetchAllPostTagsByTagsName (List<String> tagNames);

}
