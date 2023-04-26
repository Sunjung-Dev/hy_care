package com.example.hycare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {

    @GetMapping(value = "/video")
    public String home() {
        return "video.html";
    }

}
