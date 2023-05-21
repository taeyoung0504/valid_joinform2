package com.tang.BoardStudy;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class MainController2 {

	@GetMapping("/test")
	public String roott(Principal principal) {
		System.out.println("ID정보 : " + principal.getName());
		return "test1";
	}
		
	@GetMapping("/test2")
	public String roott2() {
		return "test2";
	}
	
	@GetMapping("/manage")
	public String managePage() {
		return "admin/manage";
	}
	}


