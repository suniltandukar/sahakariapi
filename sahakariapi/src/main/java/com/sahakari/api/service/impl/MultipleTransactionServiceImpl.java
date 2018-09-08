package com.sahakari.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahakari.api.dao.MultipleTransactionDao;
import com.sahakari.api.entities.MultipleTransactiontbl;
import com.sahakari.api.service.MultipleTransactionService;

@Service
public class MultipleTransactionServiceImpl implements MultipleTransactionService {
	@Autowired
	MultipleTransactionDao multipleTransactionDao;

	@Override
	public int save(MultipleTransactiontbl multrans, int i) {
		return multipleTransactionDao.save(multrans, i);
	}

	@Override
	public List<MultipleTransactiontbl> findById(String transactionId) {
		return multipleTransactionDao.findById(transactionId);
	}

}
