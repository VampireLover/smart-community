package com.xiaojun.usercenter.service;

import com.xiaojun.common.domain.vo.BusinessUserVo;

public interface UserService {

    public BusinessUserVo findById(String userId);
}
