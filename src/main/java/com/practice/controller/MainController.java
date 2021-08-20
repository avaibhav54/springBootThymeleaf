package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("name","Vaibhav aagarwal");
		List<String>list=new ArrayList<>();
		list.add("Vaibhav");
		list.add("Yash");
		list.add("Harshit");
		list.add("Rochu");
		model.addAttribute("List", list);
		System.out.println("You are uneder about controller");
		return "about";
	}
	
	@RequestMapping("/condition")
	public String conditionalHandler(Model model)
	{
		
		model.addAttribute("IsActive",true);
		return "condition";
	}
	
	
	//handling for including fragments
	@RequestMapping("/service")
	public String ServiceHandler(Model model)
	{
		
		return "service";
	}
	
	//new about page
	
	@GetMapping("/newabout")
	public String newAbout()
	{
		return "aboutnew";
	}
}
