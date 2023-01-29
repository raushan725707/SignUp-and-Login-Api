package com.test.userlogin.controller.entiry;

import com.test.userlogin.common.Auditable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Roles extends Auditable {
	@Id
	@GeneratedValue
	private int r_id;
	private String role;
	
	

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

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

}
