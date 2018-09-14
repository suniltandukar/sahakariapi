package com.sahakari.api;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

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
	
	Map<String, Object> map = new HashMap<String, Object>();
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Map<String, Object> save(@ModelAttribute Intrate intrate){
		int save_status = intrateService.save(intrate);
		if(save_status>0) {
			map.put("status", "ok");
		}
		else {
			map.put("status", "no");
		}
		return map;
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
		map.put("data", intrateService.findAll());
		
		return map;
	}
	
	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public Map<String, Object> findById(@PathVariable("id") String id){
		map.put("data", intrateService.findById(id));
		return map;
	}
	

}
