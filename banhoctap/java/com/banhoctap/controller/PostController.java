package com.banhoctap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.banhoctap.controller.model.Post;
import com.banhoctap.entity.BHTPost;
import com.banhoctap.service.PostService;

@Controller
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping()
	@ResponseBody
	public String PostHomePage() {
		return "hehe";
	}
	
	@GetMapping(path = "/create")
	public String GetCreatePostPage() {
		return "createPost";
	}
	
	@GetMapping(path = "/{url}")
	@ResponseBody
	public String PostDetail(@PathVariable("url") String url) {
		BHTPost p = postService.fetchPostByURL(url);
		return p != null?p.getTitle(): "post not found";
	}
	
	@PostMapping(path = "/create")
	@ResponseBody
	public String uploadPost(@ModelAttribute Post post) {
		
		boolean result = postService.uploadPost(post);
		
		UploadInfo info = new UploadInfo();
		info.status = result?Status.success:Status.fail;
		info.message = "success upload to server or no :))";
		
		//return info;
		return "post";
	}
}
