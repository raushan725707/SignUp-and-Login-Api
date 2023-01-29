package com.test.userlogin.common;

import org.springframework.http.HttpStatus;

public class ApiRespone4 {
private int status;
private String msg;
private Object data;
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public ApiRespone4() {
	super();
	this.status =HttpStatus.OK.value();
	this.msg = msg;
	this.data=data;
}
public Object getData() {
	return data;
}
public void setData(Object data) {
	this.data = data;
}

}
