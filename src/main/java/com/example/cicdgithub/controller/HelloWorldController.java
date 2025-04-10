package com.example.cicdgithub.controller;

import com.example.cicdgithub.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/world")
    public String getHelloWorld(){

        return "Hello World";
    }

    @GetMapping("/oregon")
    public String getHelloOregon(){
        return "Hello Oregon";
    }
}
