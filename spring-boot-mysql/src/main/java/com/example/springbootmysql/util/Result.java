package com.example.springbootmysql.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Result {
    private Integer code = 500;
    private String message = "网络错误";
    private Map<String, Object> data = new HashMap<>();
}
