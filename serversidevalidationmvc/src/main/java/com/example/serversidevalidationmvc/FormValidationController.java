package com.example.serversidevalidationmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.serversidevalidationmvc.entities.LoginEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class FormValidationController {

	@GetMapping("/form")
	public String openForm(Model model) {
		System.out.println("hello");
		model.addAttribute("loginEntity", new LoginEntity());
		return "form";
	}
	
	@PostMapping("/submit")
	public String postMethodName(@ModelAttribute("loginEntity") LoginEntity loginEntity) {
		//TODO: process POST request
		
		return "success";
	}
	
}
