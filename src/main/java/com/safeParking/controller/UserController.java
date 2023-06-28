package com.safeParking.controller;

import com.safeParking.model.User;
import com.safeParking.repository.UserRepository;
import com.safeParking.service.UserImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserImplementation userService;

    @Autowired
    UserRepository userRepo;

    @GetMapping("/index")
    public String landingPage(Model model){
        model.addAttribute("landingPage", new User());
        return "index";
    }

    @GetMapping("/register")
    public String carPage(Model model){
        model.addAttribute("carRequest", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user){
        System.out.println("register request: " + user);
        User registerUser = userService.createUser(user);
        return "redirect:/index";
    }


}
