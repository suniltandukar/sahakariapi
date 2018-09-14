package com.sahakari.api.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sahakari.api.dao.IntrateDao;
import com.sahakari.api.entities.Intrate;

@Repository
public class IntrateDaoImpl implements IntrateDao {
	private NamedParameterJdbcTemplate template;
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public int save(Intrate intrate) {
		String query = "insert into intrate(intereststartdate, categoryid, intrate) values (:intereststartdate, :categoryid, :intrate)";
		return template.update(query, new BeanPropertySqlParameterSource(intrate));
	}

	@Override
	public int update(Intrate intrate, String id) {
		String query = "update intrate set intereststartdate=:intereststartdate, categoryid=:categoryid, intrate=:intrate where id='"+id+"'";
		return template.update(query, new BeanPropertySqlParameterSource(Intrate.class));
	}

	@Override
	public int delete(String id) {
		String query = "delete from intrate where id = '"+id+"'";
		return template.update(query, new BeanPropertySqlParameterSource(Intrate.class));
	}

	@Override
	public List<Intrate> findAll() {
		String query = "select * from intrate";
		return template.query(query, new BeanPropertyRowMapper<Intrate>(Intrate.class));
	}

	@Override
	public Intrate findById(String id) {
		String query = "select * from intrate where id = '"+id+"'";
		return template.queryForObject(query, new BeanPropertySqlParameterSource(id),new BeanPropertyRowMapper<Intrate>(Intrate.class) );
	}

}
