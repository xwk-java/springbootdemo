package com.xwk.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {


    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "hello spring boot";
    }
}
