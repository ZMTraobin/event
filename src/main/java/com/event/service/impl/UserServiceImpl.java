package com.event.service.impl;

import com.event.common.AjaxResult;
import com.event.domain.UserInfo;
import com.event.repository.UserRepository;
import com.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public AjaxResult register(UserInfo userInfo) {
        if(userRepository.register(userInfo)==1)
            return AjaxResult.success();
        return AjaxResult.error();
    }

    @Override
    public AjaxResult login(UserInfo userInfo) {
        if(userRepository.login(userInfo)==1)
            return AjaxResult.success();
        return AjaxResult.error();
    }
}
