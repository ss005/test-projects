package com.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	@RequestMapping("/home")
	public ModelAndView show() {
		
		System.out.println("SpringController::show()");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("Home Page");

		return mv;
	}
}
