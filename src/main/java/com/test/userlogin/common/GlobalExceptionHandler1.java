package com.test.userlogin.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler1 {
	@ExceptionHandler
	public ResponseEntity handleException1(Exception e) {
	APIResponse1 apiResponse1=new APIResponse1();
		apiResponse1.setMessage("ooops something wrong");
		
		apiResponse1.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(apiResponse1);
}
}
