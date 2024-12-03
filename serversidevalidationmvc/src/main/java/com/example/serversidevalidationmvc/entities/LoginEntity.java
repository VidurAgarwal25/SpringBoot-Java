package com.example.serversidevalidationmvc.entities;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginEntity {

	@NotBlank(message="User Name cannot be blank!!")
	@Size(min=3, max=18, message="User Name must be between 3 - 18 characters")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9. _%+-]+@[a-zA-Z0-9. -]+\\\\. [a-zA-Z]{2,}$",message = "Invalid Email!!")
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
