package com.sahakari.api.service;

import java.util.List;

import com.sahakari.api.entities.MultipleTransactiontbl;

public interface MultipleTransactionService {
	public int save(MultipleTransactiontbl multrans, int i);

	public List<MultipleTransactiontbl> findById(String transactionId);

}
