package com.sahakari.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sahakari.api.dao.MultipleTransactionDao;
import com.sahakari.api.entities.MultipleTransactiontbl;
import com.sahakari.api.service.MultipleTransactionService;

@RequestMapping("/multransaction")
@RestController
public class MultipleTransactionController {
	@Autowired
	MultipleTransactionService multipleTransactionService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Map<String, Object> save(@ModelAttribute MultipleTransactiontbl multrans) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (multrans.getInputter() != null) {
				List<Integer> status_list = new ArrayList<Integer>();
				int length = multrans.getAccountNumber().length;
				
				for (int i = 0; i < length; i++) {
					
					multrans.setTransactionNo(i + 1);
					int save_status = multipleTransactionService.save(multrans, i);
					status_list.add(save_status);
				}
				if (status_list.contains(0)) {
					map.put("status", HttpStatus.BAD_REQUEST);
				} else {
					map.put("status", HttpStatus.OK);
				}
			} else {
				map.put("status", HttpStatus.UNAUTHORIZED);
			}
		} catch (Exception e) {
			System.out.println(e);
			map.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return map;
	}
	
	@RequestMapping(value="/findById/{id}", method = RequestMethod.GET)
	public Map<String, Object> findById(@PathVariable("id") String transactionId){
		Map<String, Object> map = new HashMap<String, Object>();
		List<MultipleTransactiontbl> list = multipleTransactionService.findById(transactionId);
		System.out.println(transactionId);
		map.put("data", list);
		return map;
	}

}
