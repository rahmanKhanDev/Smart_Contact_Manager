package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

// page controller
@Controller
public class PageController {
    // home page route
    @GetMapping("/home")
    public String honePage() {
        // retrun lvn
        System.out.println("home page loading...");
        return "home";
    }

    // about page route
    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        // retrun lvn
        System.out.println("about page loading...");
        return "about";
    }

    // services page route
    @GetMapping("/services")
    public String servicesPage() {
        // retrun lvn
        System.out.println("services page loading...");
        return "services";
    }

}
