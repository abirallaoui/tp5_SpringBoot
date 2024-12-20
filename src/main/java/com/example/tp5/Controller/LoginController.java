package com.example.tp5.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";  // Ceci fait référence à login.html dans resources/templates
    }
}