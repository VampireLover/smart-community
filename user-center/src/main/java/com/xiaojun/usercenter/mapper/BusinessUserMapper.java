package com.xiaojun.usercenter.mapper;

import com.xiaojun.usercenter.domain.entity.BusinessUser;

public interface BusinessUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessUser record);

    int insertSelective(BusinessUser record);

    BusinessUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessUser record);

    int updateByPrimaryKey(BusinessUser record);

    BusinessUser selectByUserId(String UserId);

}