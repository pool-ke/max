package com.shiyan.hellospring.service;

import com.shiyan.hellospring.entity.User;
import com.shiyan.hellospring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User select(int id){
        return userMapper.select(id);
    }
}
