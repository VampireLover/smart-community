package com.xiaojun.usercenter.controller;

import com.xiaojun.common.bean.ResponseResult;
import com.xiaojun.common.domain.vo.BusinessUserVo;
import com.xiaojun.usercenter.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/findById")
    public ResponseResult findById(String userId){
        BusinessUserVo userVo = userService.findById(userId);
        return ResponseResult.success(userVo);
    }
}
