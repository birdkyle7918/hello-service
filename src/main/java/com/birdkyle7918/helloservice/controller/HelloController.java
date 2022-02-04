package com.birdkyle7918.helloservice.controller;

import com.birdkyle7918.helloservice.service.HttpRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HttpRequestService httpRequestService;

    @GetMapping("/printHello")
    public String printHello(){
        return "hello";
    }

    @GetMapping("/http_request")
    public void doHttpRequest(){
        httpRequestService.doHttpRequest();
    }

}
