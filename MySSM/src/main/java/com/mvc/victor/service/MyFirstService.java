package com.mvc.victor.service;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
	
	
	
	public String getChineseName(String name){
		if("miaomiao".equals(name)){
			return "ß÷´ó±¦";
		}else if("maomao".equals(name)){
			return "Ã«´ó±¦";
		}else{
			return null;
		}
	}

}
