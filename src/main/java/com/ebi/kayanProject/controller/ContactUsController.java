package com.ebi.kayanProject.controller;

import com.ebi.kayanProject.entity.UserPrinciple;
import com.ebi.kayanProject.model.ContactUsDto;
import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.service.ContactUsServiceInt;
import com.ebi.kayanProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/contactUs")
public class ContactUsController {

    private final ContactUsServiceInt contactUsService;

    public ContactUsController(ContactUsServiceInt contactUsService) {

        this.contactUsService = contactUsService;
    }


    @GetMapping
    public String SendMessage(Model model) {
        ContactUsDto contactUsDto = new ContactUsDto();
        UserDto userDto = new UserDto();
        userDto.setId(Objects.requireNonNull(getLoggedInUser()).getId());
        contactUsDto.setUser(userDto);
        model.addAttribute("contactUsDto", contactUsDto);
        return  "contact";
    }

    @PostMapping
    public String SendMessage(@ModelAttribute ContactUsDto contactUsDto) {
        contactUsService.SendMessage(contactUsDto);
        return "redirect:/contactUs";
    }
    private UserPrinciple getLoggedInUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof UserPrinciple) {
            return (UserPrinciple) authentication.getPrincipal();
        }
        return null;
    }

}
