package com.test.userlogin.common;

import org.springframework.http.HttpStatus;

public class APIResponse2 {
private int status;
private Object token;

public Object getToken() {
	return token;
}
public void setToken(Object token) {
	this.token = token;
}
public APIResponse2() {
	super();
	this.status =HttpStatus.ACCEPTED.value();
//this.status=HttpStatus.ACCEPTED.valueOf("successfull login");
	this.message = message;
}

private Object message;
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}

public Object getMessage() {
	return message;
}
public void setMessage(Object message) {
	this.message = message;
}
public void setData(String string) {
	// TODO Auto-generated method stub
	
}

}
