package com.mvc.victor.service;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
	
	
	
	public String getChineseName(String name){
		if("miaomiao".equals(name)){
			return "����";
		}else if("maomao".equals(name)){
			return "ë��";
		}else{
			return null;
		}
	}

}
