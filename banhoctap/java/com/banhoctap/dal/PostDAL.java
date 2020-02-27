package com.banhoctap.dal;

import org.springframework.stereotype.Repository;

import com.banhoctap.entity.BHTPost;
import com.banhoctap.dalimp.PostImp;

@Repository
public class PostDAL implements PostImp{

	public boolean savePost(BHTPost post) {
		System.out.println("save post called from post dal");
		return false;
	}

	//su dung de truy cap CSDL
}
