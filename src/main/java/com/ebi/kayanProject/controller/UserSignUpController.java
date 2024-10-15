package com.ebi.kayanProject.controller;

import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signUp")
public class UserSignUpController {

    private final UserService userService;

    public UserSignUpController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public String registerUser(Model model) {
        model.addAttribute("Dto", new UserDto());
        return"signup";
    }
    @PostMapping
  public String registerUser(@ModelAttribute UserDto userDto) {
        userService.RegisterUser(userDto);
        return "redirect:/logIn";
    }

}
