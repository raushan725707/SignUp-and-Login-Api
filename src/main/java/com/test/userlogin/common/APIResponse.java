package com.test.userlogin.common;

import org.springframework.http.HttpStatus;


public class APIResponse {

	private Integer status;
	private Object data;
	private Object message;
	private Object token;
	
//	
//	
//	
//	
	public APIResponse() {
		super();
		this.status =HttpStatus.ACCEPTED.value();
		this.data = data;
		this.message=message;
				this.token = token;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	
//	
//	
//	
	public void setData() {
		this.data = data;
	}
public void setData(Object data) {
		this.data = data;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object error) {
		this.message = error;
	}
	public Object getToken() {
		return token;
	}
	public void setToken(Object token) {
		this.token = token;
	}
//	
//	
//	
//
//	
//	
	
	
}
