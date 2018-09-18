package com.sahakari.api.utils;

import java.util.ArrayList;
import java.util.List;

public class Generator {
	
	public List<Integer> chequeNumberGen(int startCount, int quantity) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=startCount; i<=quantity; i++) {
			int chequeNumber = 1000+i;
			list.add(chequeNumber);
		}
		return list;
	}

}
