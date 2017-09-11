package com.mvc.victor.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.victor.pojo.UserDO;
import com.mvc.victor.service.ShowUserService;

@Controller
@RequestMapping(value="/user")
public class ShowUserController {
	@Resource
	private ShowUserService service ;
	
	@RequestMapping(value="/show_{userId}",method = RequestMethod.GET)
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response,@PathVariable("userId") String userId,ModelMap modelMap){
		//modelMap.addAttribute("value", str);
        service.getUser(userId,modelMap);
        return new ModelAndView("userDetail",modelMap);
	}
	
}
