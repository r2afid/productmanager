package com.example.inventoryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller 
public class HomeController {

    @GetMapping("/") 
    public String welcome(Model model) {
        
        model.addAttribute("message", "Welcome to the Inventory System!");
        model.addAttribute("serverTime", LocalDateTime.now());

        return "index"; 
    }
}
