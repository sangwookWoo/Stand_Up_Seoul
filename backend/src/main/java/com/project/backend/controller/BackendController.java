package com.project.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@Controller
public class BackendController {
    @GetMapping("")
    public String home(){
        return "Success";
    }

//    @GetMapping("/main")
//    public String index() {
//        return "index";
//    }

//    @GetMapping("/")
//    public String root() {
//        return "redirect:/index";
//    }
}
