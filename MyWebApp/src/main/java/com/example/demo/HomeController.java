package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController
{
	@RequestMapping("Sample") 
	public String home(HttpServletRequest kun)
	{
	HttpSession session = kun.getSession();	
    String name = kun.getParameter("name");
    String age = kun.getParameter("age"); 
	System.out.println("Hi " + name + " " + age);
	session.setAttribute("name", name);
	session.setAttribute("age", age);
	return "Sample";
	}

}
