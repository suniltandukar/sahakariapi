package com.sahakari.api.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sahakari.api.dao.StatementDao;
import com.sahakari.api.entities.Customertbl;
import com.sahakari.api.entities.Statementtbl;

@Repository
public class StatementDaoImpl implements StatementDao {
	private NamedParameterJdbcTemplate template;
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Statementtbl> findByAccountNo(String accountNo) {
		String sql = "select bookingDate, valueDate, debitamount, creditamount, balanceamount from statementtbl where AccountNumber='"+accountNo+"'";
		return template.query(sql, new BeanPropertyRowMapper<Statementtbl>(Statementtbl.class));
	}

	@Override
	public Customertbl customerByAccountNo(String accountNo) {
		String sql = "select accountstbl.accountName, customertbl.name, now() as curdate from accountstbl JOIN customertbl on customertbl.pid = accountstbl.pid where accountstbl.accountNumber='"+accountNo+"'";
		return template.queryForObject(sql, new BeanPropertySqlParameterSource(Customertbl.class), new BeanPropertyRowMapper<Customertbl>(Customertbl.class));
	}

	@Override
	public List<Statementtbl> findByAccountDate(String accountNo, String datefrom, String dateto) {
		String sql = "select bookingDate, valueDate, debitamount, creditamount, balanceamount from statementtbl where accountNumber='"+accountNo+"' and (valueDate between '"+datefrom+"' and '"+dateto+"') ";
		return template.query(sql, new BeanPropertyRowMapper<Statementtbl>(Statementtbl.class));
	}

}
