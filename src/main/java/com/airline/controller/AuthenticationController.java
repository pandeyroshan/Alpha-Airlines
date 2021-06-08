package com.airline.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dao.UserDAO;

@Controller
public class AuthenticationController {
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView showRegisterPage() {
		return new ModelAndView("register");
	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register() {
		return new ModelAndView("redirect:/login");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showLoginPage() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> request, HttpSession session) {
		String username = request.get("username");
		String password = request.get("password");
		
		if(UserDAO.validate(username, password)) {
			session.setAttribute("username", username);
			return new ModelAndView("redirect:/");
		} else {
			return new ModelAndView("redirect:/login");
		}
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		return new ModelAndView("redirect:/login");
	}
}
