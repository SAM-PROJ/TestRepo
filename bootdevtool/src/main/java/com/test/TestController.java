package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String Test()
	{
		int a=69;
		int b=59;
		int c=120;
		return "this is for learning /t sum of a and b is "+(a+b+c);
	}
}