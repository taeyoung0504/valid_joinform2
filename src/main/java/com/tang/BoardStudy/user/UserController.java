package com.tang.BoardStudy.user;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller 
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
	/*
    @GetMapping("/login")
    public String login() {
        return "login_form";
    }
    */
    @GetMapping("/signup")
    public String signup(UserCreateForm userCreateForm) {
        return "signup_form";
    }
   
    
    //id 중복값 유효성 검증
    @PostMapping("/check")
    public ResponseEntity<Integer> checkUsername(@RequestParam("username") String username) {
        List<SiteUser> users = userService.checkUsername(username);
        int result = (users != null && !users.isEmpty()) ? 1 : 0;
        return ResponseEntity.ok(result);
    }
    
    
    @PostMapping("/signup")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult, Model model) {
        if (!userCreateForm.getPassword1().equals(userCreateForm.getPassword2())) {
            bindingResult.reject("passwordInCorrect", "2개의 패스워드가 일치하지 않습니다.");
            return "signup_form";
        }

        if (bindingResult.hasErrors()) {
        	 return "signup_form";
        	/*
            // 에러가 있을 경우
            Map<String, String> errors = new HashMap<>();
            
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
        model.addAttribute("errors", errors); */
             
        } else {
            // 에러가 없을 경우
            try {
                userService.create(userCreateForm.getUsername(), userCreateForm.getEmail(), userCreateForm.getPassword1());
            } catch (DataIntegrityViolationException e) {
                e.printStackTrace();
                bindingResult.reject("signupFailed", "이미 등록된 사용자입니다.");
                return "signup_form";
            } catch (Exception e) {
                e.printStackTrace();
                bindingResult.reject("signupFailed", e.getMessage());
                return "signup_form";
            }

            return "redirect:/";
        }
    }
   
}
