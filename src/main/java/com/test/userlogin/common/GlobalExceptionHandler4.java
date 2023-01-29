package com.test.userlogin.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler4 {
	@ExceptionHandler
	public ResponseEntity handleException2(Exception e) {
	ApiRespone4 ap=new ApiRespone4();
ap.setMsg("did not able to add role check......mistake is there");
ap.setData("something wrong");
//		apiResponse2.setToken("invalid token or expired");
//		apiResponse2.setMessage("you have not permission to access this api");
	return ResponseEntity.status(HttpStatus.FORBIDDEN.value()).body(ap);
	}
//	
}
