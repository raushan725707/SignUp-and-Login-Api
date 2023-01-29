package com.test.userlogin.common;

import org.springframework.http.HttpStatus;

public class APIResponse1 {
	private Integer status;
	private Object data;
	private Object message;
	
//	
//	
//	
//
	public APIResponse1() {
		super();

		this.status =HttpStatus.OK.value();
	this.data = data;
	this.message = message;
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
	public void setData(Object data) {
		this.data = data;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
	
	
}
