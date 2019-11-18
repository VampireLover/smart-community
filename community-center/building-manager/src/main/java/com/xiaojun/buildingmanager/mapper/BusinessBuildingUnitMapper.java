package com.xiaojun.buildingmanager.mapper;

import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingUnit;

import java.util.List;

public interface BusinessBuildingUnitMapper {
    int insert(BusinessBuildingUnit record);

    int insertSelective(BusinessBuildingUnit record);

    BusinessBuildingUnit selectById(String unitId);

    List<BusinessBuildingUnit> selectAll();

    int deleteById(String unitId);

    int updateByPrimaryKeySelective(BusinessBuildingUnit record);

    List<BusinessBuildingUnit> selectByFloor(String floorId);
}