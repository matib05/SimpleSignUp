package com.matib05.SimpleSignUp.controller;

import com.matib05.SimpleSignUp.model.Signup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @GetMapping("/signup")
    public String signUpForm(Model model) {
        model.addAttribute("signup", new Signup());
        return "signup";
    }

    @PostMapping("/signup")
    public String signUpSubmit(@ModelAttribute Signup signup) {
        return "result";
    }
}
