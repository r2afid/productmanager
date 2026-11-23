package com.example.inventoryapp.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class HomeController{
    @GetMapping("/")
    public String welcome(Model model) {

        model.addAttribute("message", "Welcome to the Inventory System!");
        model.addAttribute("serverTime", LocalDateTime.now());



        return "index";
    }
    
}