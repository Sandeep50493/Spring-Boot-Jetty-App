package com.itSolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {
		
		String msg="Welcome to My Home Page from Welcome Message Controller";
		
		return msg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		
		model.addAttribute("msg","Good Morning");
		
		
		return "index";
	}
	
	
	

}
