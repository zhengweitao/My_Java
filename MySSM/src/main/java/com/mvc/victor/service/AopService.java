package com.mvc.victor.service;

import org.springframework.stereotype.Service;

@Service
public class AopService {
	
	public void doOperate(){
		System.out.println("****��ʼִ�з��� doOperate()****");
	}
	
	public String getValue(String con){
		System.out.println("****��ʼִ�з��� getValue()****");
		return con=="1"?"origin":"new";
	}
}
