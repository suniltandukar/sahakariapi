package com.sahakari.api.dao;

public interface ChequeDao {

	void issueCheque(String accountNumber, String issueId, int startingChequeNumber, int chequeQuantity,
			String issueDatenp, String issueDateen, Integer integer);

}
