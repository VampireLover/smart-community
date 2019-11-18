package com.xiaojun.buildingmanager.service.impl;

import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingRoom;
import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingUnit;
import com.xiaojun.buildingmanager.mapper.BusinessBuildingUnitMapper;
import com.xiaojun.buildingmanager.mapper.BusinessBuildingRoomMapper;
import com.xiaojun.common.service.BusinessBuildingRoomService;
import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;
import com.xiaojun.common.domain.vo.BusinessBuildingUnitVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author xiaojun
 */
@Service
@org.apache.dubbo.config.annotation.Service
public class BusinessBuildingRoomServiceImpl implements BusinessBuildingRoomService {
    @Resource
    private BusinessBuildingRoomMapper buildingRoomMapper;

    @Resource
    BusinessBuildingUnitMapper buildingUnitMapper;

    @Override
    @Transactional
    public BusinessBuildingRoomVo findInfoById(String roomId) {
        BusinessBuildingRoomVo buildingRoomVo=new BusinessBuildingRoomVo();
        BusinessBuildingRoom buildingRoom = buildingRoomMapper.selectByPrimaryKey(roomId);
        BeanUtils.copyProperties(buildingRoom,buildingRoomVo);
        BusinessBuildingUnit buildingUnit = buildingUnitMapper.selectById(buildingRoom.getUnitId());
        BusinessBuildingUnitVo buildingUnitVo=new BusinessBuildingUnitVo();
        BeanUtils.copyProperties(buildingUnit,buildingUnitVo);
        buildingRoomVo.setBuildingUnitVo(buildingUnitVo);
        return buildingRoomVo;
    }

}
