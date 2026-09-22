package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class harsha {

    @GetMapping("/")
    public String cipy() {
        System.out.println("cipy printed to console");
        return "Now it is working fine"; // This text will now display in the browser
    }
}