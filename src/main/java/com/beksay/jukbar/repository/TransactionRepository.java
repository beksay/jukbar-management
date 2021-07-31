package com.beksay.jukbar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beksay.jukbar.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	

}
