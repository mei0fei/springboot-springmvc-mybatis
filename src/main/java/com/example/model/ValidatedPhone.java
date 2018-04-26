package com.example.model;

import com.example.anno.ContactNumberConstraint;

public class ValidatedPhone{
	
	@ContactNumberConstraint
	private String phone;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
