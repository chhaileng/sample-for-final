package info.chhaileng.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import info.chhaileng.app.model.User;
import info.chhaileng.app.service.UserService;

@Controller
public class UserController {
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	// Mapping request from client
	@RequestMapping(value={"/","/view"})
	public String view(ModelMap model) {
		// add all users to view page
		model.addAttribute("users",userService.getAllUsers());
		return "view";
	}
	
	@RequestMapping("/add")
	public String add(ModelMap model) {
		model.addAttribute("user",new User()); // add an empty object to form add.html to bind data
		return "add";
	}
	
	@PostMapping("/add/save")
	public String save(@ModelAttribute("user") User user) {
		System.out.println(user);
		userService.add(user);
		return "redirect:/view";
	}
}
