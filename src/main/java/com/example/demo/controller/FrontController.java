package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontController {

    @GetMapping("superman")
    @ResponseBody
    public String getSuperMan() {
        return "Superman is flying.";
    }
}
