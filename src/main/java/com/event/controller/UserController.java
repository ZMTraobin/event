package com.event.controller;

import com.event.common.AjaxResult;
import com.event.domain.UserInfo;
import com.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    //注册
    @RequestMapping("register")
    public AjaxResult register(@RequestBody UserInfo userInfo){
        return userService.register(userInfo);
    }

    //登录
    @RequestMapping("login")
    public AjaxResult login(@RequestBody @Validated UserInfo userInfo){

        //throw new Exception("123");
        return userService.login(userInfo);
    }

}
