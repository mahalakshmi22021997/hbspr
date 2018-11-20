package com.cg.ctrl;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {

	ArrayList<String> cityList;
	ArrayList<String> skillSet;
	
	@RequestMapping(value = "showLogin")
	public String preparedLogin(Model model) {
		model.addAttribute("login", new Login());
		return "login";

	}

	@RequestMapping(value = "checkLogin")
	public String checkLogin() {
		return "loginSuccess";

	}
	
	@RequestMapping(value = "showRegister")
	public String preparedRegister(Model model){
		
		cityList=new ArrayList<String>();
		cityList.add("Eluru");
		cityList.add("Vijayawada");
		cityList.add("Hyderabad");
		cityList.add("Chennai");
		cityList.add("Bangalore");
		
		skillSet=new ArrayList<String>();
		skillSet.add("java");
		skillSet.add("html");
		skillSet.add("serlets");
		skillSet.add("hibernate");
		skillSet.add("spring");
		
		
		model.addAttribute("cityList", cityList);
		model.addAttribute("skillSet", skillSet);
		model.addAttribute("register", new User());
		
		return "register";
		
	}
	@RequestMapping(value = "checkRegister")
	public String checkRegister(@ModelAttribute("user")
	@Valid User user,BindingResult result,Model model) {
		if(result.hasErrors()){
			System.out.println("Error");
			model.addAttribute("cityList", cityList);
			model.addAttribute("skillSet", skillSet);
			return "register";
			}
		else{
		model.addAttribute("user", user);
		System.out.println("valid data");
		return "registerSuccess";

	}
	
	}
}
