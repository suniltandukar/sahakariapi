package com.sahakari.api.dao.impl;

import java.io.ByteArrayInputStream;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;
import javax.sql.rowset.serial.SerialBlob;

import org.hibernate.loader.plan.build.spi.MetamodelDrivenLoadPlanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.stereotype.Repository;

import com.sahakari.api.dao.SignatureDao;
import com.sahakari.api.entities.MemberDocument;
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
		String query = "insert into signatures (accountNumber, image) values (:accountNumber, :image)";
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("image", new SqlLobValue(new ByteArrayInputStream(signatures.getImage()), signatures.getImage().length, new DefaultLobHandler()), Types.BLOB);
		map.addValue("accountNumber", signatures.getAccountNumber());
		return template.update(query, map);
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
	
	@Override
	public Signatures findByAccountNumber(String accountNumber) {
		String query ="select * from signatures where accountNumber = '"+accountNumber+"'";
		return template.queryForObject(query, new BeanPropertySqlParameterSource(accountNumber), new BeanPropertyRowMapper<Signatures>(Signatures.class) );
	}

	@Override
	public int saveDocument(MemberDocument memberDocument, int i) {
		System.out.println("member doc"+memberDocument.getDocument_type()[i]);
		System.out.println("pid"+memberDocument.getPid());
		System.out.println("image"+memberDocument.getImage());
		
		String query = "insert into document_image (document_type, pid, image) values (:document_type, :pid, :image)";
		
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("document_type", memberDocument.getDocument_type()[i]);
		map.addValue("pid", memberDocument.getPid());
		map.addValue("image", new SqlLobValue(new ByteArrayInputStream(memberDocument.getImage()), memberDocument.getImage().length, new DefaultLobHandler()), Types.BLOB);
		return template.update(query, map);
	}
}
