package com.sahakari.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahakari.api.dao.StatementDao;
import com.sahakari.api.entities.Customertbl;
import com.sahakari.api.entities.Statementtbl;
import com.sahakari.api.service.StatementService;

@Service
public class StatementServiceImpl implements StatementService {
	@Autowired
	private StatementDao statementDao;

	@Override
	public List<Statementtbl> findByAccountNo(String accountNo) {
		return statementDao.findByAccountNo(accountNo);
	}

	@Override
	public Customertbl customerByAccountNo(String accountNo) {
		return statementDao.customerByAccountNo(accountNo);
	}

	@Override
	public List<Statementtbl> findByAccountDate(String accountNo, String datefrom, String dateto) {
		return statementDao.findByAccountDate(accountNo, datefrom, dateto);
	}

}
