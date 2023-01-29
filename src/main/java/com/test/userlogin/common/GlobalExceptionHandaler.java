package com.test.userlogin.common;


	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


	@ControllerAdvice
	public class GlobalExceptionHandaler{

		
//	
//		public ResponseEntity handleException(Exception e) {
//	APIResponse apiResponse=new APIResponse();
//	apiResponse.setToken("access denied");
//			//apiResponse.setMessage("incorrect information");
//		//apiResponse.setData("invalid information");
//
//		//apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//		//apiResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(apiResponse);
//	}
//		
//		@ExceptionHandler
//		public ResponseEntity handleException2(Exception e) {
//		APIResponse2 apiResponse2=new APIResponse2();
//
//			apiResponse2.setStatus(HttpStatus.FORBIDDEN.value());
//			apiResponse2.setToken("invalid token or expired");
//			apiResponse2.setMessage("you have not permission to access this api");
//			return ResponseEntity.status(HttpStatus.FORBIDDEN.value()).body(apiResponse2);
//		}
//		
	}


