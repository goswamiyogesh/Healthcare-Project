package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.BankDetails;

public interface BankRepo extends JpaRepository<BankDetails, Integer>{
	@Query("select bd.balance from BankDetails bd where bd.bid=?1")
	public long getBalance(int bid);
}
