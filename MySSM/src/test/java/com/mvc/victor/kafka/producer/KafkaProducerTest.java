package com.mvc.victor.kafka.producer;

import java.util.concurrent.ExecutionException;

import javax.annotation.Resource;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.concurrent.ListenableFuture;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:kafka-test.xml"})
public class KafkaProducerTest {
	
	@Resource
	KafkaTemplate<Integer,String> kafkaTemplate;
	@Test
	public void test() {
		/*KafkaProducer producer = new KafkaProducer();
		producer.sendMessage();*/
		ListenableFuture<SendResult<Integer, String>> lf =  kafkaTemplate.send("test","it is from java testing client !");
		if(lf!=null){
			try {
				SendResult result = lf.get();
				RecordMetadata record = result.getRecordMetadata();
				System.out.println("#############"+record.topic());
				System.out.println("#############"+record.serializedKeySize());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
