package com.xiaojun.buildingmanager.service;

import com.github.pagehelper.PageInfo;
import com.xiaojun.common.domain.dto.BusinessBuildingRoomDto;
import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;

import java.util.List;

public interface RoomService {
    public void addRoom(BusinessBuildingRoomDto businessBuildingRoomDto);

    public PageInfo findAll(Integer page, Integer size);

    public List<BusinessBuildingRoomVo> findRoomByUser(String userId);

    public List<BusinessBuildingRoomVo> findRoomByUnit(String unitId);

    public int updateById(BusinessBuildingRoomDto roomDto);

    public  int delById(String roomId);
}
