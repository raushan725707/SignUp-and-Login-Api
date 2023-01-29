package com.test.userlogin.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler2 {
	
	
	
	
	@ExceptionHandler
	public ResponseEntity handleException(Exception e) {
	APIResponse apiResponse=new APIResponse();
	apiResponse.setToken("access denied");
			apiResponse.setMessage("incorrect information");
		apiResponse.setData("invalid information");

		apiResponse.setStatus(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(apiResponse);
	}
}
