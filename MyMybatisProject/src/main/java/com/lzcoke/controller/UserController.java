package com.lzcoke.controller;

import com.lzcoke.pojo.User;
import com.lzcoke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public Map userList() {
        List<User> users = userService.userList();
        Map<String, Object> map = new HashMap<>();
        map.put("user", users);
        return map;
    }


}
