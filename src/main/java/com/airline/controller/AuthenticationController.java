package com.airline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dao.UserDAO;

@Controller
public class AuthenticationController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView showIndexPage() {
		UserDAO.validate("root", "rootjuet");
		return new ModelAndView("index");
	}
}
