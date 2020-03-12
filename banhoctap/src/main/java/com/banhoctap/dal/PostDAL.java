package com.banhoctap.dal;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.banhoctap.entity.BHTPost;
import com.banhoctap.dalimp.PostImp;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PostDAL implements PostImp{

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean savePost(BHTPost post) {
		System.out.println("save post called from post dal");
		
		Session session;
		try {
			 session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			 session = sessionFactory.openSession();
		}
		

		int key= (Integer) session.save(post);
		if (key != 0)
			return true;
		
		return false;
	}

	@Transactional
	public boolean updatePost(BHTPost post) {
		
		return false;
	}

	@Transactional
	public BHTPost fetchPostById(int postID) {
		System.out.println("fetch post by id called from post dal");
		
		Session session;
		try {
			 session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			 session = sessionFactory.openSession();
		}
		
		BHTPost post = session.get(BHTPost.class, postID);
		
		if (post == null)
		{
			System.out.println("post not found: Id = " + postID);
			return null;
		}
			
		return post;
	}

	public BHTPost fetchPostByURL(String postURL) {
		//load and get method can't load in this situation
		System.out.println("fetch post by URL called from post dal");
		
		Session session;
		try {
			 session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			 session = sessionFactory.openSession();
		}
		
		BHTPost post = session.byNaturalId(BHTPost.class)
							  .using("URL", postURL)
							  .load();
		
		if (post == null)
		{
			System.out.println("post not found: URL = " + postURL);
			return null;
		}
		return post;
	}

	public List<BHTPost> fetchPostsOfAuthor(int userID) {
		//load and get method can't load in this situation
		System.out.println("fetch post by URL called from post dal");
		
		Session session;
		try {
			 session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			 session = sessionFactory.openSession();
		}
		
		BHTPost post = session.byNaturalId(BHTPost.class)
							  .using("PosterUserID", userID)
							  .load();
		
		if (post == null)
		{
			System.out.println("post not found: userID = " + userID);
			return null;
		}
		return null;
	}
	
	public List<BHTPost> fetchPostsByPostCategory(int postCategoryID){
		return null;
	}
	
}
