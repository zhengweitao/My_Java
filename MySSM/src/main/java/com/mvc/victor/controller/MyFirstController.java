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

import com.mvc.victor.service.MyFirstService;

@Controller
@RequestMapping(value="/test")
public class MyFirstController {
	@Resource
	private MyFirstService service ;
	
	@RequestMapping(value="/test1")
	public ModelAndView test(HttpServletRequest request,HttpServletResponse response){
		String val = "victor" ;
		return new ModelAndView("test","value",val);
	}
	
	@RequestMapping(value="/test2_{user}"	,method = RequestMethod.GET)
	public ModelAndView test2(HttpServletRequest request,HttpServletResponse response,@PathVariable("user") String user){
		
		return new ModelAndView("test","value",service.getChineseName(user));
	}
	
	@RequestMapping(value="/test3_{user}"	,method = RequestMethod.GET)
	public ModelAndView test3(HttpServletRequest request,HttpServletResponse response,@PathVariable("user") String str,ModelMap modelMap){
		modelMap.addAttribute("value", str);
		return new ModelAndView("test",modelMap);
	}
	
}
