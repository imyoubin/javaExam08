package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestbookApiController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}