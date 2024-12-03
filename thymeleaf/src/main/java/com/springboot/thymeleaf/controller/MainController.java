package com.springboot.thymeleaf.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name", "Vidur Agarwal");
		model.addAttribute("currentdate", new Date().toLocaleString());
		return "about";
	}

	@GetMapping("/multidata")
	public String multiData(Model m) {
		List<String> list = List.of("Vidur", "Agarwal", "Vidur Agarwal");
		m.addAttribute("names", list);
		return "multidata";
	}

	@GetMapping("/conditionhandler")
	public String conditionHandler(Model m) {
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "m");
		List<Integer> list = List.of(100,200,300,400);
		m.addAttribute("mylist", list);
		return "conditionhandler";
	}
	
	@GetMapping("/fragmenthandler")
	public String fragmentHandler(Model model) {
		model.addAttribute("", "");
		return "fragmenthandler";
	}
	
	
	@GetMapping("/inheritingthymeleaf")
	public String inheritingThymeleaf(Model model) {
		model.addAttribute("", "");
		return "contact";
	}
	
}
