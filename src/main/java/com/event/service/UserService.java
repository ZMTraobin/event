package com.event.service;

import com.event.common.AjaxResult;
import com.event.domain.UserInfo;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
public interface UserService {

    //注册
    public AjaxResult register(UserInfo userInfo);

    //登录
    public AjaxResult login(UserInfo userInfo);

}
