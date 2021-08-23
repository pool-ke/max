package com.shiyan.hellospring.controller;


import com.shiyan.hellospring.entity.User;
import com.shiyan.hellospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getUser/{id}")
    public User getUser(@PathVariable int id){
        return userService.select(id);
    }
}
