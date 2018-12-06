package com.org.ajkart.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class LoginModel {
@Id
private String userId;
private String description;
private String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
