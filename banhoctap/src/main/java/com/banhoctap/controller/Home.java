package com.banhoctap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

	@RequestMapping("/")
	public String WellcomePage() {
		return "home";
	}
}
