package com.tang.BoardStudy.Login;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
    @GetMapping("/login")
    public String login() {
        return "login_form";
    }
    

    @GetMapping("kakao_login") //kakao developer에 등록한 redirect URL 
    public String kakaoLogin(@RequestParam String code) throws IOException {
    	
    	 return "main";
    			
    	
    }
    
	
}
