package com.bht.core;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.banhoctap.entity.BHTPost;
import com.banhoctap.entity.BHTUserAccount;

public class BuilderTemp {

	public static List<BHTPost> makePost(int count) {
		List<BHTPost> posts = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
			BHTPost p = new BHTPost();
			p.setTitle("Tieu de bai viet");
			p.setPublishDtm(new Date(2020, 03, 07));
			
			BHTUserAccount account = new BHTUserAccount();
			account.setUsername("Nguyen Hong Phuc");
			p.setAuthor(account);
			p.setReadTime(10);
			
			posts.add(p);
		}
				
		return posts;
	}
}
