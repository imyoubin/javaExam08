package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestbookController {

    @RequestMapping("/")
    public String main() {
        return "main"; 
    }
}