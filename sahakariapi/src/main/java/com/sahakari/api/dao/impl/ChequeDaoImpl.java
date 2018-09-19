package com.sahakari.api.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sahakari.api.dao.ChequeDao;

@Repository
public class ChequeDaoImpl implements ChequeDao {

	private NamedParameterJdbcTemplate template;
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public void issueCheque(String accountNumber, String issueId, int startingChequeNumber, int chequeQuantity,
			String issueDatenp, String issueDateen, Integer lastChequeNumber) {

		String sql="insert into issuechequetbl(accountNumber,issueId,startingChequeNumber,chequeQuantity,issueDatenp,issueDateen,lastChequeNumber) "
				+ "value(:accountNumber,:issueId,:startingChequeNumber,:chequeQuantity,:issueDatenp,:issueDateen,:lastChequeNumber)";
		MapSqlParameterSource map=new MapSqlParameterSource();
		map.addValue("accountNumber", accountNumber);
		map.addValue("issueId", issueId);
		map.addValue("startingChequeNumber", startingChequeNumber);
		map.addValue("chequeQuantity", chequeQuantity);
		map.addValue("issueDatenp", issueDatenp);
		map.addValue("issueDateen", issueDateen);
		map.addValue("lastChequeNumber", lastChequeNumber);
		
		template.update(sql, map);
		
	}

}
