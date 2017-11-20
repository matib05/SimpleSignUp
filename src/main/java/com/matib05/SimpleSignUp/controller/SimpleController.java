package com.matib05.SimpleSignUp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @RequestMapping("/simple")
    public String simple() {
        return "html/simple";
    }
}
