package com.banhoctap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhoctap.controller.model.Post;
import com.banhoctap.dal.PostDAL;
import com.banhoctap.entity.BHTPost;
import com.banhoctap.entity.BHTUserAccount;

@Service
public class PostService {
	//BLL

	@Autowired
	PostDAL postDAL;
	
	public boolean uploadPost(Post post) {
		
		BHTPost bhtPost = new BHTPost();
		bhtPost.bind(post);
		BHTUserAccount user = new BHTUserAccount();
		user.setId(1);
		bhtPost.setAuthor(user);
		
		postDAL.savePost(bhtPost);
		return true;
	}
	
	public BHTPost fetchPostByURL(String url) {
		return postDAL.fetchPostByURL(url);
	}
}
