package com.yiwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yiwei.vo.SimpleTestVo;

@Controller
@RequestMapping("/queryTest")
public class TestQueryController {

	@RequestMapping("/simpleTest")
	public String queryTestMenthod(){
		System.out.println("this is a simple test");
		String msg = "this is a simple test";
		return msg;
	}
	
	
	
	
}
