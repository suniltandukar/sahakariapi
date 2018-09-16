package com.sahakari.api.service.impl;

import java.util.List;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahakari.api.dao.SignatureDao;
import com.sahakari.api.entities.Signatures;
import com.sahakari.api.service.SignatureService;

@Service
public class SignatureServiceImpl implements SignatureService {
	
	@Autowired
	SignatureDao signatureDao;
	

	@Override
	public int saveSignature(Signatures signatures) {
		return signatureDao.saveSignature(signatures);
	}


	@Override
	public List<Signatures> findAll() {
		return signatureDao.findAll();
	}


	@Override
	public Signatures findById(String signatureid) {
		return signatureDao.findById(signatureid);
	}


	@Override
	public Signatures findByAccountNumber(String accountNumber) {
		return signatureDao.findByAccountNumber(accountNumber);
	}

}
