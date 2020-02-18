package com.banhoctap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

	@RequestMapping("/")
	public String WellcomePage() {
		return "home";
	}
	
	//demo modelview
	@RequestMapping("/modelview")
	public ModelAndView Demo1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modelview");
		
		mav.addObject("account", "nguyenhongphuc98");
		
		return mav;
	}
	
	//demo modelmap
		@RequestMapping("/modelmap")
		public String Demo2(ModelMap modelMap) {
			
			modelMap.addAttribute("wellcome", "helo, my name is software");
			
			return "modelmap";
		}
}
