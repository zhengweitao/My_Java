package com.mvc.victor.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.victor.service.AopService;

@Controller
@RequestMapping(value="/aop")
public class AopController {
	@Resource
	private AopService service ;
	
	@RequestMapping(value="/test")
	public ModelAndView test(HttpServletRequest request,HttpServletResponse response){
		service.doOperate();
		return new ModelAndView("aop");
	}
	
	@RequestMapping(value="/get")
	public ModelAndView get(HttpServletRequest request,HttpServletResponse response){
		String val = service.getValue("1");
		return new ModelAndView("test","value",val);
	}
	
}
