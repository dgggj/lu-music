package com.che.lu_music.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
