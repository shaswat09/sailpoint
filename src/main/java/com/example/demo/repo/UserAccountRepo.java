package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserAccount;

@Repository
public interface UserAccountRepo extends JpaRepository<UserAccount, Long> {

	public UserAccount findByUserIdAndPin(String userId,int pin);
	
	public UserAccount findByUserId(String userId);
}
