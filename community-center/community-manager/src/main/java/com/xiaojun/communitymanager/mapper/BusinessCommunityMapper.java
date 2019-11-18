package com.xiaojun.communitymanager.mapper;

import com.xiaojun.communitymanager.domain.entity.BusinessCommunity;

public interface BusinessCommunityMapper {
    int deleteByPrimaryKey(Integer communityId);

    int insert(BusinessCommunity record);

    int insertSelective(BusinessCommunity record);

    BusinessCommunity selectByPrimaryKey(Integer communityId);

    int updateByPrimaryKeySelective(BusinessCommunity record);

    int updateByPrimaryKey(BusinessCommunity record);
}