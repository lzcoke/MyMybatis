package com.lzcoke.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int userId;
    private String nickname;
    private String avatar;
    private Date createDate;
}
