package com.example.cicdgithub.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getHelloWorldService(){
        return "Hello World Service";
    }

    public String getHelloOregonService(){
        return "Hello Oregon Service";
    }
}
