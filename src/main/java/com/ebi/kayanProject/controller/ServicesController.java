package com.ebi.kayanProject.controller;


import com.ebi.kayanProject.entity.UserPrinciple;
import com.ebi.kayanProject.model.ServicesDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.service.ServicesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServicesController {
    private final ServicesService servicesService;

public ServicesController(ServicesService servicesService) {

    this.servicesService = servicesService;
}


    @GetMapping("/AllServices")
    public String allServices(Model model) {
    List<ServicesDto> services = servicesService.getAllServices();
    model.addAttribute("services", services);
    return "allservice";
    }
    @PostMapping("/apply/{serviceId}")
    public String applyToService(@PathVariable Long serviceId, @AuthenticationPrincipal UserPrinciple user, RedirectAttributes redirectAttributes) {
        servicesService.applyToService(serviceId, user);
        redirectAttributes.addFlashAttribute("successMessage", "You have successfully applied for the service! We Will Call You as soon as possible");
        return "redirect:/service/AllServices";
    }


}
