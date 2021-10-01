package com.shiyan.hellospring.controller;

import com.shiyan.hellospring.configuration.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("redisSet/{key}/{value}")
    public boolean redisSet(@PathVariable String key, @PathVariable String value) {
        return redisUtil.set(key, value);
    }


    @RequestMapping("redisGet/{key}")
    public String redisGet(@PathVariable String key) {
        return redisUtil.get(key).toString();
    }
}
