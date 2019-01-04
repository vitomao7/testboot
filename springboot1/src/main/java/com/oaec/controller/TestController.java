package com.oaec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oaec.service.IUserService;

@Controller
public class TestController {
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/hello.do")
	public String hello(){	
		System.out.println("hello world");
		return "hello world";
	}
	
	@RequestMapping("/index.do")
	public String index(){
		
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/findUsers.do")
	public List<Map<String, Object>> findUsers(){
		
		return userService.selectAllUsers();
		
	}
	
	
	
	@ResponseBody
	@RequestMapping("/test.do")
	public String testTrans(){
		userService.insertUsers();

		return "test";
	}
	
	
}
