package com.sahakari.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sahakari.api.entities.Customertbl;
import com.sahakari.api.entities.Statementtbl;
import com.sahakari.api.service.StatementService;

@RestController
@RequestMapping("/statement")
public class StatementController {
	@Autowired
	private StatementService statementService;
	
	@RequestMapping(value="/findByAccountNo", method = RequestMethod.GET)
	public Map<String, Object> findByAccountNo(@RequestParam("accountNumber") String accountNo, @RequestParam("datefrom") String datefrom, @RequestParam("dateto") String dateto) {
		Map<String, Object> data = new HashMap<String, Object>();
		List<Statementtbl> statement = new ArrayList<Statementtbl>();
		if((datefrom.isEmpty() && dateto.isEmpty()) || datefrom.isEmpty() || dateto.isEmpty()) {
		statement = statementService.findByAccountNo(accountNo);
		}
		statement = statementService.findByAccountDate(accountNo, datefrom, dateto);
		
		Customertbl customer = statementService.customerByAccountNo(accountNo);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("accountNumber", accountNo);
		map.put("statement", statement);
		map.put("customer", customer);
	data.put("data", map);
		
		return data;
	}
	
	
	
}
