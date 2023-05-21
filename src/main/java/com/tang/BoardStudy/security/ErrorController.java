package com.tang.BoardStudy.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

	@GetMapping("/error/403")
	public String showErrorPage() {
		return "error/403";
	}
	
	@GetMapping("/admin")
	public String showErrorPage2() {
		return "error/404";
	}
}
