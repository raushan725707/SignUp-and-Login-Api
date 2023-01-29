package com.test.userlogin.controller.dto;

import com.test.userlogin.common.Auditable;

public class RolesPermissiondto {
	
	private int r_id;
	private String role;
	private String createdby;
	private String updatedby;
	private String created_on;
	private String updated_on;
	
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public PermissionResponse getPermission() {
		return permission;
	}
	public void setPermission(PermissionResponse permission) {
		this.permission = permission;
	}
	public RolesPermissiondto() {
		super();
		// TODO Auto-generated constructor stub
	}
	private PermissionResponse permission;

}
