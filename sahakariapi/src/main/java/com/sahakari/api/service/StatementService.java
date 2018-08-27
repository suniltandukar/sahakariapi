package com.sahakari.api.service;

import java.util.List;

import com.sahakari.api.entities.Customertbl;
import com.sahakari.api.entities.Statementtbl;

public interface StatementService {
	public List<Statementtbl> findByAccountNo(String accountNo);

	public Customertbl customerByAccountNo(String accountNo);

	public List<Statementtbl> findByAccountDate(String accountNo, String datefrom, String dateto);


}
