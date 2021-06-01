package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sushi")
public class CeShiController {

    @Override
    @RequestMapping("/index")
    public String toString() {
        return "这是一个假数据";
    }
}


