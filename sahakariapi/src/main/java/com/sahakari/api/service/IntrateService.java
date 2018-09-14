package com.sahakari.api.service;

import java.util.List;

import com.sahakari.api.entities.Intrate;

public interface IntrateService {
	
	public int save(Intrate intrate);
	public int update(Intrate intrate, String id);
	public int delete(String id);
	public List<Intrate> findAll();
	public Intrate findById(String id);

}
