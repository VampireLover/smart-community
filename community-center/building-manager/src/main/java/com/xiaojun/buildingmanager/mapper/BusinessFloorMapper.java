package com.xiaojun.buildingmanager.mapper;

import com.xiaojun.buildingmanager.domain.entity.BusinessFloor;

import java.util.List;

public interface BusinessFloorMapper {
    int insert(BusinessFloor record);

    int insertSelective(BusinessFloor record);

    List<BusinessFloor> selectAll();

    BusinessFloor selectById(String floorId);
}