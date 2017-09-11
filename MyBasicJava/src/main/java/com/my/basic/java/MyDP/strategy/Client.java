package com.my.basic.java.MyDP.strategy;

import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
		AbstractStrategy as1 = new StrategyA();
		AbstractStrategy as2 = new StrategyB();
		Map<String,AbstractStrategy> map = new HashMap<>();
		map.put("A", as1);
		map.put("B", as2);
		//此种方法可以避免if-else 
		
		
		User user = new User(map.get("B"));
		user.useStrategy();
	}

}
