package com.xiaojun.usermanager.mapper;

import com.xiaojun.usermanager.domain.entity.BusinessBuildingOwner;

public interface BusinessBuildingOwnerMapper {
    int deleteByPrimaryKey(String ownerId);

    int insert(BusinessBuildingOwner record);

    int insertSelective(BusinessBuildingOwner record);

    BusinessBuildingOwner selectByPrimaryKey(String ownerId);

    int updateByPrimaryKeySelective(BusinessBuildingOwner record);

    int updateByPrimaryKey(BusinessBuildingOwner record);
}