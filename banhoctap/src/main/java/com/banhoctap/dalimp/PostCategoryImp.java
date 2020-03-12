package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTPostCategory;


public interface PostCategoryImp {
	
	boolean savePostCategory(BHTPostCategory postCategory);
	
	boolean deletePostCategory(BHTPostCategory postCategory);
	
	boolean deletePostCategory(int postCategoryID);
	
	BHTPostCategory fetchCategory(int postCategoryID);
	
	List<BHTPostCategory>fetchAllPostCategories();
	
	BHTPostCategory fetchPostcategoryByID(int postID);
	
}
