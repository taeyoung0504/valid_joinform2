package com.tang.BoardStudy.user;



import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
	
	
	@NotBlank(message = "Username은 필수값 입니다.")
	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$", message = "Username은 문자열 6-12사이이며, 특수문자를 사용할 수 없습니다.")
    private String username;

	@Pattern(regexp="^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{6,12}$",
	         message = "비밀번호는 영문자와 숫자, 특수기호가 적어도 1개 이상 포함된 6자~12자의 비밀번호여야 합니다.")
    private String password1;

	@NotBlank(message = "패스워드 확인은 필수 입력 값입니다.")
    private String password2;

	@NotBlank(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식에 맞지 않습니다.") 
    private String email;
	

	
}