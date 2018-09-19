package com.sahakari.api.service;

public interface ChequeService {

	void issueCheque(String accountNumber, String issueId, int startingChequeNumber, int chequeQuantity,
			String issueDatenp, String issueDateen, Integer lastChequeNumber);

}
