package com.sahakari.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahakari.api.dao.ChequeDao;
import com.sahakari.api.service.ChequeService;

@Service
public class ChequeServiceImpl implements ChequeService {

	@Autowired 
	ChequeDao chequeDao;
	
	@Override
	public void issueCheque(String accountNumber, String issueId, int startingChequeNumber, int chequeQuantity,
			String issueDatenp, String issueDateen, Integer lastChequeNumber) {
		chequeDao.issueCheque(accountNumber,issueId,startingChequeNumber,chequeQuantity,
				issueDatenp,issueDateen,lastChequeNumber);
	}

}
