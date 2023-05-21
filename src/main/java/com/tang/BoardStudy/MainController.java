package com.tang.BoardStudy;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/")
	public String root() {
		return "main";
	}
	
	@GetMapping("/api/username")
	@ResponseBody
	public String getUsername(Principal principal) {
		String username = principal.getName();
		return username;
		
	}
	
}
	
	
	

