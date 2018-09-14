package com.sahakari.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahakari.api.dao.IntrateDao;
import com.sahakari.api.entities.Intrate;
import com.sahakari.api.service.IntrateService;

@Service
public class IntrateServiceImpl implements IntrateService {
	@Autowired
	IntrateDao intrateDao;

	@Override
	public int save(Intrate intrate) {
		return intrateDao.save(intrate);
	}

	@Override
	public int update(Intrate intrate, String id) {
		return intrateDao.update(intrate, id);
	}

	@Override
	public int delete(String id) {
		return intrateDao.delete(id);
	}

	@Override
	public List<Intrate> findAll() {
		return intrateDao.findAll();
	}

	@Override
	public Intrate findById(String id) {
		return intrateDao.findById(id);
	}

}
