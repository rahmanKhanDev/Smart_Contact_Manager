package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// page controller
@Controller
public class PageController {
    // home page
    @GetMapping("/home")
    public String honePage() {
        // retrun lvn
        System.out.println("home page");
        return "home";
    }
}
