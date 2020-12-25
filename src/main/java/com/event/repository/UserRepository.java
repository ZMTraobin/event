package com.event.repository;

import com.event.common.AjaxResult;
import com.event.domain.UserInfo;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
public interface UserRepository {

    //注册
    public int register(UserInfo userInfo);

    //登录
    public int login(UserInfo userInfo);


}
