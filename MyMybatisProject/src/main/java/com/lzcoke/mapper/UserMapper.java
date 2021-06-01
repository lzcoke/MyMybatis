package com.lzcoke.mapper;

import com.lzcoke.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    @Select("select * from user")
    List<User> userList();
}
