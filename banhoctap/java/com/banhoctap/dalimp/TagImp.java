package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTTag;

public interface TagImp {
	
	//Do Tag chỉ có ID và tên, ta chỉ thêm và xoá.
	//Không được chỉnh sửa tên tag.
	boolean insertTag(BHTTag tag);
	
	//Cho phép thêm mới một Tag chỉ với tên.
	boolean insertTag(String tagName);
	
	boolean deleteTag(BHTTag tag);
	
	//Dùng câu truy vấn %like% để matching tag tốt hơn.
	List<BHTTag> fetchTagsByName (String tagName);
	
	List<BHTTag> fetchAllTags ();

}
