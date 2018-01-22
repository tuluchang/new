package com.taotao.content.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String showIndex(){
		System.out.println("我爱銮銮");
		return "index";
	}
}
