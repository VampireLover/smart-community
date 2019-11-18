package com.xiaojun.usermanager.mapper;

import com.xiaojun.usermanager.domain.entity.BusinessBuildingOwnerRoomRel;

import java.util.List;

public interface BusinessBuildingOwnerRoomRelMapper {
    int deleteByPrimaryKey(Integer relId);

    int insert(BusinessBuildingOwnerRoomRel record);

    int insertSelective(BusinessBuildingOwnerRoomRel record);

    BusinessBuildingOwnerRoomRel selectByPrimaryKey(Integer relId);

    int updateByPrimaryKeySelective(BusinessBuildingOwnerRoomRel record);

    int updateByPrimaryKey(BusinessBuildingOwnerRoomRel record);

    List<BusinessBuildingOwnerRoomRel> selectByownerId(Integer ownerId);
}