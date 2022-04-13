package com.hga.blog.vo;

import lombok.Data;

@Data
public class LoginParam {

    private String account;

    private String password;

    private String nickname;
}