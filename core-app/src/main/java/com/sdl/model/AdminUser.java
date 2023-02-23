package com.sdl.model;


import jakarta.persistence.*;


@Entity(name = "AdminUser")
@Table(name = "admin_user")
public class AdminUser extends User{

	private String authenticateMethod;

	public String getAuthenticateMethod() {
		return authenticateMethod;
	}

	public void setAuthenticateMethod(String authenticateMethod) {
		this.authenticateMethod = authenticateMethod;
	}



}
