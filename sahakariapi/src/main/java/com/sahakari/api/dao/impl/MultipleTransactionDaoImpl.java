package com.sahakari.api.dao.impl;

import java.sql.Blob;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sahakari.api.dao.MultipleTransactionDao;
import com.sahakari.api.entities.MultipleTransactiontbl;

@Repository
public class MultipleTransactionDaoImpl implements MultipleTransactionDao {
	private NamedParameterJdbcTemplate template;
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public int save(MultipleTransactiontbl multrans, int i) {
		String query = "insert into multipletransactiontbl (transactionId, transactionNo, bookingDate, valueDate, processingDate, accountNumber, drcr, amount, narrative, cheqNumber, transactionCode, branchId, inputter) values (:transactionId, :transactionNo, :bookingDate, :valueDate["+i+"], now(), :accountNumber["+i+"], :drcr["+i+"], :amount["+i+"], :narrative["+i+"], :cheqNumber["+i+"], :transactionCode["+i+"], :branchId, :inputter)";
		return template.update(query, new BeanPropertySqlParameterSource(multrans));
	}

	@Override
	public List<MultipleTransactiontbl> findById(String transactionId) {
		String query = "select * from multipletransactiontbl where transactionId = '"+transactionId+"'";
		return template.query(query, new BeanPropertyRowMapper<MultipleTransactiontbl>(MultipleTransactiontbl.class));
	}
	


}
