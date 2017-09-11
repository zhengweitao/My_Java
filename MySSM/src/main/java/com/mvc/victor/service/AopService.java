package com.mvc.victor.service;

import org.springframework.stereotype.Service;

@Service
public class AopService {
	
	public void doOperate(){
		System.out.println("****开始执行方法 doOperate()****");
	}
	
	public String getValue(String con){
		System.out.println("****开始执行方法 getValue()****");
		return con=="1"?"origin":"new";
	}
}
