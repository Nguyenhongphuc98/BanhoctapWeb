package com.banhoctap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhoctap.controller.model.Post;
import com.banhoctap.dal.PostDAL;
import com.banhoctap.entity.BHTPost;

@Service
public class PostService {
	//BLL

	@Autowired
	PostDAL postDAL;
	
	public boolean savePost(Post post ) {
		//process logic here
		//convert post to BHT post
		postDAL.savePost(new BHTPost());
		return true;
	}
}
