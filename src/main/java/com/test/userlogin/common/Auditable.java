package com.test.userlogin.common;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable {
 @CreatedBy
 private String createdby;
 
 @LastModifiedBy
 private String updatedby;
 @Temporal(TemporalType.TIMESTAMP)
 @CreatedDate
 private String created_on;
 @Temporal(TemporalType.TIMESTAMP)
 @LastModifiedDate
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
 
}
