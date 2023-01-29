package com.test.userlogin.controller.dto;

public class PermissionDto {
	private boolean read;
	private boolean write;
	private int r_id;
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	public boolean isWrite() {
		return write;
	}
	public void setWrite(boolean write) {
		this.write = write;
	}
	public PermissionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
