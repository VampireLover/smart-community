package com.xiaojun.usercenter.service.impl;

import com.xiaojun.common.bean.ResponseResult;
import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;
import com.xiaojun.common.domain.vo.BusinessUserVo;
import com.xiaojun.usercenter.domain.entity.BusinessUser;
import com.xiaojun.usercenter.mapper.BusinessUserMapper;
import com.xiaojun.usercenter.service.GetBuildingService;
import com.xiaojun.usercenter.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    BusinessUserMapper userMapper;
    @Resource
    GetBuildingService buildingService;
    @Override
    public BusinessUserVo findById(String userId) {
        BusinessUserVo userVo=new BusinessUserVo();
        BusinessUser user = userMapper.selectByUserId(userId);
        BeanUtils.copyProperties(user,userVo);
        List<BusinessBuildingRoomVo> roomVos = buildingService.findRoomByUser(userId);
        userVo.setRoomVos(roomVos);
        return userVo;
    }
}
