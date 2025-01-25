package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.service.UserServiceImpl;


import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {


	private final UserServiceImpl userService;

	public HelloController(UserServiceImpl userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/")
	public String printWelcome(Model model) {
		//List<User> messages = userService.getAllUsers();
//		messages.add(messages.get(1));
//		messages.add(messages.get(2));
//		messages.add(messages.get(3));
		model.addAttribute("messages", userService.getAllUsers());
		return "people/users";
	}
}