package com.example.serversidevalidationmvc.entities;


public class LoginEntity {

	private String userName;
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "LoginEntity [userName=" + userName + ", email=" + email + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
