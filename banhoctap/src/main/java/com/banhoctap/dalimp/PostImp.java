package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTPost;

//define method dal shoud be implement
public interface PostImp {

	boolean savePost(BHTPost post);
	
	boolean updatePost(BHTPost post);
	
	BHTPost fetchPostById(int postID);
	
	BHTPost fetchPostByURL(String postURL);
	
	List<BHTPost> fetchPostsOfAuthor(int userID);
	
	List<BHTPost> fetchPostsByPostCategory(int postCategoryID);
	
}
