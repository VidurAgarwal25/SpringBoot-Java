package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/demo")
	@ResponseBody			//It wont search for view but will return as it is string
	public String handleTest() {
		return "This is project using sts";
	}
}
