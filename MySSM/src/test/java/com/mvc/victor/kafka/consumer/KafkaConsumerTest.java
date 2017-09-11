package com.mvc.victor.kafka.consumer;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:kafka-test.xml"})
public class KafkaConsumerTest {
	@Resource
	KafkaMessageListenerContainer<Integer, String> container;
	@Test
	public void test() {
		System.out.println("IsRunning:"+container.isRunning());
		while(container.isRunning()){
		
		}
	}

}
