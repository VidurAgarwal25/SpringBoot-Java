package com.example.serversidevalidationmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.serversidevalidationmvc.entities.LoginEntity;

import jakarta.validation.Valid;

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
	public String postMethodName(@Valid @ModelAttribute("loginEntity") LoginEntity loginEntity, BindingResult bindingResult) {
		//TODO: process POST request
		if(bindingResult.hasErrors())
		{
			System.out.println(bindingResult);
			return "form";
		}
		return "success";
	}
	
}
