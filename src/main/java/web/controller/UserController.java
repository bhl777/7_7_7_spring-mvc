package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.User;
import web.service.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
       List<User> users = (List<User>)model.getAttribute("users");
        System.out.println(users.get(1));
        return "/people/users"; // имя представления
    }

    @PostMapping("/users")
    public String addUser(User user) {
        userService.saveUser(user);
        return "redirect:/people/users";
    }
}
