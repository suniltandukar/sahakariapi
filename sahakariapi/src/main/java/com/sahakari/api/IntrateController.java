package com.sahakari.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sahakari.api.entities.Intrate;
import com.sahakari.api.service.IntrateService;

@RestController
@RequestMapping("/intrate")
public class IntrateController {
	
	@Autowired
	IntrateService intrateService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Map<String, Object> save(@ModelAttribute Intrate intrate){
		intrateService.save(intrate);
		return null;
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public Map<String, Object> update(@PathVariable("id") String id, @ModelAttribute Intrate intrate){
		intrateService.update(intrate, id);
		return null;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public Map<String, Object> delete(@PathVariable("id") String id){
		intrateService.delete(id);
		return null;
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public Map<String, Object> findAll(){
		intrateService.findAll();
		return null;
	}
	
	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public Map<String, Object> findById(@PathVariable("id") String id){
		intrateService.findById(id);
		return null;
	}
	

}
