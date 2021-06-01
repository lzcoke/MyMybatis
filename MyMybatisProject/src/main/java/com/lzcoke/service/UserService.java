package com.lzcoke.service;

import com.lzcoke.mapper.UserMapper;
import com.lzcoke.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> userList() {
        return userMapper.userList();
    }
}
