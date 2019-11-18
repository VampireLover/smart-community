package com.xiaojun.buildingmanager.mapper;

import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingRoom;import java.util.List;

public interface BusinessBuildingRoomMapper {
    int deleteByPrimaryKey(String roomId);

    int insert(BusinessBuildingRoom record);

    int insertSelective(BusinessBuildingRoom record);

    BusinessBuildingRoom selectByPrimaryKey(String roomId);

    int updateByPrimaryKeySelective(BusinessBuildingRoom record);

    int updateByPrimaryKey(BusinessBuildingRoom record);

    List<BusinessBuildingRoom> selectAll();

    List<BusinessBuildingRoom> selectByUser(String serId);

    List<BusinessBuildingRoom> selectByUnitId(String unitId);
}