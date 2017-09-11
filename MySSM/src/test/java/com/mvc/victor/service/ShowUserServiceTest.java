package com.mvc.victor.service;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.mvc.victor.pojo.UserDO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:application.xml"})
@WebAppConfiguration
@Transactional
public class ShowUserServiceTest {
	@Resource
	ShowUserService service;
	
	private static Logger logger = Logger.getLogger(ShowUserServiceTest.class);
	
	@Test
	public void test() {
		doSelect();
		//doInsert();
	}
	
	private void doSelect(){
		ModelMap modelMap = new ModelMap();
		service.getUser("maomao", modelMap);
		Collection<Object> l = modelMap.values();
		for(Object str:l){
			if(str instanceof String)
//			System.out.println(str);
			logger.info(str);
		}
	}
	
	//@Rollback
	private void doInsert(){
		UserDO user = new UserDO();
		user.setId(3);
		user.setUserid("maomao");
		user.setUsername("毛毛");
		user.setNickname("毛大宝");
		user.setEmail("maomao@163.com");
		user.setPassword("111");
		System.out.println("插入成功记录数: "+service.saveUser(user));
		
	}
	
	
}
