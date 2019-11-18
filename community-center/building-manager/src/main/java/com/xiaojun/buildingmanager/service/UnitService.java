package com.xiaojun.buildingmanager.service;

import com.github.pagehelper.PageInfo;
import com.xiaojun.common.domain.dto.BusinessBuildingUnitDto;
import com.xiaojun.common.domain.vo.BusinessBuildingUnitVo;

import java.util.List;


public interface UnitService {
    public BusinessBuildingUnitVo findById(String unitId);
    public PageInfo findAll(Integer page , Integer size);
    public int delById(String unitId);
    public int updateById(BusinessBuildingUnitDto unitDto);
    public List<BusinessBuildingUnitVo> findByFloor(String floorId);
}
