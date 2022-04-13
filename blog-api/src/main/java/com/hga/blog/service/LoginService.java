package com.hga.blog.service;

import com.hga.blog.dao.pojo.SysUser;
import com.hga.blog.vo.LoginParam;
import com.hga.blog.vo.Result;

public interface LoginService {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    Result logout(String token);

    Result register(LoginParam loginParam);

    SysUser checkToken(String token);
}
