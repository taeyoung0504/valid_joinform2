package com.tang.BoardStudy.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

import com.tang.BoardStudy.user.UserRole;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
    
    private LocalDateTime create_userTime = LocalDateTime.now(); //회원 생성 시간
    
    @Enumerated(EnumType.STRING)
    private UserRole role;
    

    private int partner; // 파트너 여부 1: 파트너임 
    
  
    private int admin;  // 관리자 여부 1: 관리자임
    
   
}