package com.rest.spring.boot.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping
	public String getHome(ModelAndView mav) {
		mav.addObject("welcome", "Welcome, User");
		return "index";
	}
}
