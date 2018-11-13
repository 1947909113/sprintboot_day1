package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping("/save")
	public String register(User user){
		userService.register(user);
		return "redirect:login.jsp";
	}
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		User login = userService.login(user);
		if(login!=null){
			request.getSession().setAttribute("login", login);
			return "redirect:/emp/findAll";
		}else{
			return "redirect:../login.jsp";
		}
	}
}
