package com.service.comparingservice.controllers;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.View;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BodyController {
	@RequestMapping("/")
	public ModelAndView Show()
	{
		return new ModelAndView("home");
	}
}
