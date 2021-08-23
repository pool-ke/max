package com.shiyan.hellospring.mapper;

import com.shiyan.hellospring.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User select(int id);
}
