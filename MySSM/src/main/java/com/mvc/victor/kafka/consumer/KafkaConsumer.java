package com.mvc.victor.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.log4j.Logger;
import org.springframework.kafka.listener.MessageListener;



public class KafkaConsumer implements MessageListener<String,String>{
	
	private static Logger logger = Logger.getLogger(KafkaConsumer.class);

	@Override
	public void onMessage(ConsumerRecord<String, String> record) {
		logger.info("********************************Topic:"+record.topic());
		logger.info("********************************Key:"+record.key());
		logger.info("********************************Value:"+record.value());
	}
	

}
