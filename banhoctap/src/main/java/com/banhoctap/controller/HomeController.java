package com.banhoctap.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.banhoctap.controller.model.Post;
import com.banhoctap.entity.BHTPost;
import com.banhoctap.service.PostService;
import com.bht.core.BuilderTemp;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	PostService postService;

	
	@GetMapping
	public String WellcomePage(ModelMap modelMap) {
		
		List<BHTPost> posts = BuilderTemp.makePost(3);
		System.out.println(posts.size());
		modelMap.addAttribute("highlight", posts.get(0));
		modelMap.addAttribute("newest", posts);
		modelMap.addAttribute("activitys", posts);

		//postService.savePost(new Post());
		return "home";
	}

	// demo modelview
	@GetMapping("/modelview")
	public ModelAndView Demo1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modelview");

		mav.addObject("account", "nguyenhongphuc98");

		return mav;
	}

	// demo modelmap
	@GetMapping("/modelmap")
	public String Demo2(ModelMap modelMap) {

		modelMap.addAttribute("wellcome", "helo, my name is software");

		return "modelmap";
	}

	// demo request param: /chitiet?id=3
	@ResponseBody
	@GetMapping(path = "/chitiet")
	public String ChiTiet(@RequestParam("id") int id) {
		return String.valueOf(id);
	}

	// demo Path variable
	@ResponseBody
	@GetMapping(path = "/chitiet/{sanpham}")
	public String ChiTietNext(@PathVariable("sanpham") String id) {
		return String.valueOf(id);
	}

	// demo Post
	@ResponseBody
	@PostMapping(path = "/chitiet")
	public String ChiTietPost(@RequestParam("nameParam") String name) {
		return name;
	}
	
	// demo Model attribute, auto map to object and it have to have same property
	// name
	@ResponseBody
	@PostMapping(path = "/atribute")
	public String ChiTietPost(@ModelAttribute BHTPost post) {
		return post.getTitle();
	}
}
