package com.example.springbootmysql.controller;

import com.example.springbootmysql.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class userController {
    @GetMapping("/user")
    public Result user(@RequestParam Map<String, Object> params) {
        Result res = new Result();
        return res;
    }
}
