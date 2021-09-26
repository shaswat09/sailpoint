package com.example.demo.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class ATMRequest {

	public int pin;
	public String userId;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
