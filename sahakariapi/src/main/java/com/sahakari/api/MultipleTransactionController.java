package com.sahakari.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sahakari.api.dao.MultipleTransactionDao;
import com.sahakari.api.entities.MultipleTransactiontbl;
import com.sahakari.api.entities.UserModel;

@RequestMapping("/multransaction")
@RestController
public class MultipleTransactionController {
	@Autowired
	MultipleTransactionDao multipleTransactionDao;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Map<String, Object> save(@ModelAttribute MultipleTransactiontbl multrans, HttpSession session) {
		UserModel user = (UserModel) session.getAttribute("userDetail");
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (user != null) {
				List<Integer> status_list = new ArrayList<Integer>();
				int length = multrans.getAccountNumber().length;
				
				String branchcode = (String)session.getAttribute("currentBranchcode");
				for (int i = 0; i < length; i++) {
					multrans.setTransactionNo(i + 1);
					multrans.setBranchId(branchcode);
					int save_status = multipleTransactionDao.save(multrans, i);
					status_list.add(save_status);
				}
				if (status_list.contains(0)) {
					map.put("status", "");
					map.put("title", "unsuccessful");
				} else {
					map.put("status", "200");
					map.put("title", "successful");
				}
			} else {
				map.put("status", "401");
				map.put("title", "unauthorized");
			}
		} catch (Exception e) {
			System.out.println(e);
			map.put("status", "500");
			map.put("title", "Server Error");
		}
		return map;
	}

}
