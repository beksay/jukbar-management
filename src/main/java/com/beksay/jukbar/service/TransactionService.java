package com.beksay.jukbar.service;

import java.util.List;

import com.beksay.jukbar.model.Transaction;

public interface TransactionService {

	Transaction saveTransaction(Transaction transaction);

	Long numberOfTransactions();

	List<Transaction> findAllTransactions();

}
