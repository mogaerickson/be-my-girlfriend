package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String question() {
        return "question";
    }

    @GetMapping("/ily")
    public String ily() {
        return "ily";
    }

}