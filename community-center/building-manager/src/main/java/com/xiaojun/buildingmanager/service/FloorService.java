package com.xiaojun.buildingmanager.service;

import com.github.pagehelper.PageInfo;
import com.xiaojun.common.domain.vo.BusinessFloorVo;

public interface FloorService {
    public PageInfo findAll(Integer page, Integer size);
    public BusinessFloorVo findById(String floorId);
}
