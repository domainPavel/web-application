package com.web_application.web_application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {

    @GetMapping("/arm")
    public String getmothod(){
        return null;
    }

}
