package com.sahakari.api.dao;

import java.sql.Blob;
import java.util.List;

import com.sahakari.api.entities.MultipleTransactiontbl;

public interface MultipleTransactionDao {
	
	public int save(MultipleTransactiontbl multrans, int i);

	public List<MultipleTransactiontbl> findById(String transactionId);
	
	

}
