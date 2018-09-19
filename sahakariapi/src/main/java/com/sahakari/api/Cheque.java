package com.sahakari.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sahakari.api.service.ChequeService;
import com.sahakari.api.utils.Generator;


@RequestMapping("/cheque")
@RestController
public class Cheque {
	
	@Autowired 
	ChequeService chequeService;
	
	@RequestMapping(value= "/issueCheque")
	public Map<String, Object> issueCheque(@RequestParam Map<String, String> param){
		String accountNumber=param.get("accountNumber");
		String issueId=param.get("issueId");
		int startingChequeNumber=Integer.parseInt(param.get("startingChequeNumber"));
		int chequeQuantity=Integer.parseInt(param.get("chequeQuantity"));
		String issueDatenp=param.get("issueDatenp");
		String issueDateen=param.get("issueDateen");
		
		Generator g=new Generator();
		List<Integer> list=g.chequeNumberGen(startingChequeNumber, chequeQuantity);
		System.out.println(list.size()+"size of list");
	
		chequeService.issueCheque(accountNumber,issueId,startingChequeNumber,chequeQuantity,issueDatenp,issueDateen,list.get(list.size()-1));
		
		return null;
	}

}
