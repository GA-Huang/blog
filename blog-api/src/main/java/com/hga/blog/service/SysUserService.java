package com.hga.blog.service;

import com.hga.blog.dao.pojo.SysUser;
import com.hga.blog.vo.Result;
import com.hga.blog.vo.UserVo;

public interface SysUserService {

    SysUser findUserById(Long id);

    SysUser findUser(String account, String pwd);

    Result getUserInfoByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long authorId);
}
