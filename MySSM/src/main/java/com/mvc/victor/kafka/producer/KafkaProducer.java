package com.mvc.victor.kafka.producer;

import javax.annotation.Resource;

import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {
	
	@Resource
	KafkaTemplate<Integer,String> kafkaTemplate;
	
	public void sendMessage(){
		kafkaTemplate.sendDefault(1, "it is from java client !");
	}

}
