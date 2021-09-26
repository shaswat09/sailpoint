package com.example.demo.request;

public class ATMOperationRequestModel {

	public String operation;
public	String userId;
public long amount;
public String getOperation() {
	return operation;
}
public void setOperation(String operation) {
	this.operation = operation;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}


}
