package com.ebi.kayanProject.controller;

import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.service.MyUserDetailsService;
import com.ebi.kayanProject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logIn")
public class UserLogInController {

//    private final UserService userService;
//    private final MyUserDetailsService myUserDetailsService;

//    public UserLogInController(UserService userService, MyUserDetailsService myUserDetailsService) {
//        this.userService = userService;
//        this.myUserDetailsService = myUserDetailsService;
//    }


    @GetMapping
    public  String loginUser() {
//        model.addAttribute("loginUserDto", new LoginUserDto());
        return "login";
    }
//    @PostMapping
//    public  String loginUser(@ModelAttribute LoginUserDto loginUserDto) {
//       myUserDetailsService.loadUserByUsername(loginUserDto.getFName());
//        return "redirect:/home";
//    }





}
