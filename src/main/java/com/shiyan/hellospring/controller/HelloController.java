package com.shiyan.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/test")
    public String test(){
        return "kemuyuan,testing";
    }

    public String test2(){
        return "boring";
    }
}
