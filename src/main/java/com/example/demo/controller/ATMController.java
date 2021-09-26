package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserAccount;
import com.example.demo.repo.UserAccountRepo;
import com.example.demo.request.ATMOperationRequestModel;
import com.example.demo.request.ATMRequest;
import com.example.demo.response.ATMResponse;

@RestController
@RequestMapping("/atm")
public class ATMController {
	
	@Autowired
	private UserAccountRepo userAccountRepo;

	@PostMapping("/login")
	public ATMResponse login(@RequestBody ATMRequest atmRequest) {
		ATMResponse atmResponse=new ATMResponse();
		UserAccount userAccount=	userAccountRepo.findByUserIdAndPin(atmRequest.getUserId(), atmRequest.getPin());
		if(userAccount!=null)
		atmResponse.setBalance(userAccount.getBalance());	
		return atmResponse;
	}

@PostMapping("/operation")	
public ATMResponse atmOperation(@RequestBody ATMOperationRequestModel operationRequestModel) {
	ATMResponse atmResponse=new ATMResponse();
	UserAccount userAccount=	userAccountRepo.findByUserId(operationRequestModel.getUserId());
	if(operationRequestModel.getOperation().equalsIgnoreCase("Withdraw")) {
		userAccount.setBalance(userAccount.getBalance()-operationRequestModel.getAmount());
	}else if(operationRequestModel.getOperation().equalsIgnoreCase("Deposit")) {
		userAccount.setBalance(userAccount.getBalance()+operationRequestModel.getAmount());
	}
	 userAccount=userAccountRepo.save(userAccount);
	 atmResponse.setBalance(userAccount.getBalance());
	 return atmResponse;
}
}
