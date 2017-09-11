package com.mvc.victor.service;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.mvc.victor.dao.UserDAO;
import com.mvc.victor.pojo.UserDO;

@Service
public class ShowUserService {
	
	@Resource
	private UserDAO userDAO ;
	
	
	
	public void getUser(String userId,ModelMap modelMap){
		UserDO user = userDAO.getUser(userId);
		modelMap.addAttribute("userid", user.getUserid());
		modelMap.addAttribute("username", user.getUsername());
		modelMap.addAttribute("nickname", user.getNickname());
		modelMap.addAttribute("email", user.getEmail());
	}
	
	public int saveUser(UserDO user){
		return userDAO.saveUser(user);
	}
}
