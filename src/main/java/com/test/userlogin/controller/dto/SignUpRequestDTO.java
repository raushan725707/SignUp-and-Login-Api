package com.test.userlogin.controller.dto;

public class SignUpRequestDTO {
	
	private String name;
	private String email;
	private String password;
	private String mob;
	private boolean isactive = true;
	private boolean isdeleted = false;
	private int r_id;
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public boolean isIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public SignUpRequestDTO() {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mob = mob;
		this.isactive = isactive;
		this.isdeleted = isdeleted;
		this.r_id = r_id;
	}
	@Override
	public String toString() {
		return "SignUpRequestDTO [name=" + name + ", email=" + email + ", password=" + password + ", mob=" + mob
				+ ", isactive=" + isactive + ", isdeleted=" + isdeleted + ", r_id=" + r_id + "]";
	}
	
	
	
}
