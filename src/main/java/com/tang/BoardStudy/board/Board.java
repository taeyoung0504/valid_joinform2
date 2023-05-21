package com.tang.BoardStudy.board;

import java.time.LocalDateTime;


import org.springframework.data.annotation.CreatedDate;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Board {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(length = 200)
	private String subject;
	
	@Column(length = 200)
	private String content;
	
	@CreatedDate
	private LocalDateTime createDate;


}