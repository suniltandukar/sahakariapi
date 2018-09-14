package com.sahakari.api.dao.impl;

import java.util.List;

import javax.sql.DataSource;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sahakari.api.dao.SignatureDao;
import com.sahakari.api.entities.Signatures;

@Repository
public class SignatureDaoImpl implements SignatureDao {
	private NamedParameterJdbcTemplate template;
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public int saveSignature(Signatures signatures) {
		String query = "insert into signatures (accountNumber, image) values (:accountNumber, :image')";
		 return template.update(query, new BeanPropertySqlParameterSource(signatures));
	}

	@Override
	public List<Signatures> findAll() {
		String query = "select signatureid, accountNumber from signatures";
		return template.query(query, new BeanPropertyRowMapper<Signatures>(Signatures.class));
	}

	@Override
	public Signatures findById(String signatureid) {
		String query ="select * from signatures where signatureid = '"+signatureid+"'";
		return template.queryForObject(query, new BeanPropertySqlParameterSource(signatureid), new BeanPropertyRowMapper<Signatures>(Signatures.class) );
	}
	

}
