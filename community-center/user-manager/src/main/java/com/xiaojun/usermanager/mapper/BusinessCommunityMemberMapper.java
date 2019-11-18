package com.xiaojun.usermanager.mapper;

import com.xiaojun.usermanager.domain.entity.BusinessCommunityMember;

public interface BusinessCommunityMemberMapper {
    int insert(BusinessCommunityMember record);

    int insertSelective(BusinessCommunityMember record);
}