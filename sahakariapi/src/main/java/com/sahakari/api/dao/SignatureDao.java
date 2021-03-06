package com.sahakari.api.dao;

import java.util.List;

import javax.sql.rowset.serial.SerialBlob;

import com.sahakari.api.entities.MemberDocument;
import com.sahakari.api.entities.Signatures;

public interface SignatureDao {
	
	public int saveSignature(Signatures signatures);

	public List<Signatures> findAll();

	public Signatures findById(String signatureid);

	public Signatures findByAccountNumber(String accountNumber);

	public int saveDocument(MemberDocument memberDocument, int i);

}
