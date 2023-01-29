package com.test.userlogin.controller.entiry;

import com.test.userlogin.common.Auditable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Permission extends Auditable{
@Id
@GeneratedValue
private int pid;
private boolean read;
private boolean write;
@OneToOne(cascade = CascadeType.ALL)
private Roles roles;

public Roles getRoles() {
	return roles;
}



public void setRoles(Roles roles) {
	this.roles = roles;
}



public int getPid() {
	return pid;
}



public void setPid(int pid) {
	this.pid = pid;
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



public Permission() {
	super();
}


}
