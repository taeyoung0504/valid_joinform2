package com.tang.BoardStudy.user;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
@RestController // 메시지를 리턴
@ControllerAdvice // 익셉션을 모두 낚아챈다. 
public class ControllerExceptionHandler {
  @ExceptionHandler(RuntimeException.class) // 모든 예외를 처리 
  public String validationException(RuntimeException e) {
    return e.getMessage();
  }
  
}