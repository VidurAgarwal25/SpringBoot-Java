package com.springboot.thymeleaf.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@SuppressWarnings("deprecation")
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name", "Vidur Agarwal");
		model.addAttribute("currentdate", new Date().toLocaleString());
		return "about"; 
	}
}
