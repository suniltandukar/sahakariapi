package com.sahakari.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/cheque")
@RestController
public class Cheque {
	
	@RequestMapping(value= "/issue")
	public Map<String, Object> issueCheque(@RequestParam Map<String, String> param){
		Map<String, Object> map = new HashMap<String, Object>();
		
		return null;
	}

}
