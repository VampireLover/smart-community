package com.xiaojun.buildingmanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingRoom;
import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingUnit;
import com.xiaojun.buildingmanager.domain.entity.BusinessFloor;
import com.xiaojun.buildingmanager.mapper.BusinessBuildingRoomMapper;
import com.xiaojun.buildingmanager.mapper.BusinessBuildingUnitMapper;
import com.xiaojun.buildingmanager.mapper.BusinessFloorMapper;
import com.xiaojun.buildingmanager.service.FloorService;
import com.xiaojun.buildingmanager.service.RoomService;
import com.xiaojun.buildingmanager.service.UnitService;
import com.xiaojun.common.domain.dto.BusinessBuildingRoomDto;
import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;
import com.xiaojun.common.domain.vo.BusinessBuildingUnitVo;
import com.xiaojun.common.domain.vo.BusinessFloorVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 小二哥哥
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Resource
    BusinessBuildingRoomMapper buildingRoomMapper;

    @Resource
    UnitService unitService;

    @Resource
    FloorService floorService;

    @Override
    public List<BusinessBuildingRoomVo> findRoomByUser(String userId) {
        List<BusinessBuildingRoomVo> roomVos=new ArrayList<>();
        List<BusinessBuildingRoom> rooms = buildingRoomMapper.selectByUser(userId);
        for (BusinessBuildingRoom room:rooms) {
            BusinessBuildingRoomVo roomVo=new BusinessBuildingRoomVo();
            BeanUtils.copyProperties(room,roomVo);
            roomVos.add(roomVo);
        }
        return roomVos;
    }

    @Override
    public void addRoom(BusinessBuildingRoomDto businessBuildingRoomDto) {
        BusinessBuildingRoom buildingRoom =new BusinessBuildingRoom();
        BeanUtils.copyProperties(businessBuildingRoomDto,buildingRoom);
        buildingRoom.setRoomId(new Date().toString());
        buildingRoomMapper.insert(buildingRoom);
    }

    @Override
    public List<BusinessBuildingRoomVo> findRoomByUnit(String unitId) {
        List<BusinessBuildingRoomVo> roomVos=new ArrayList<>();
        List<BusinessBuildingRoom> rooms = buildingRoomMapper.selectByUnitId(unitId);
        for (BusinessBuildingRoom room:rooms) {
            BusinessBuildingRoomVo roomVo=new BusinessBuildingRoomVo();
            BeanUtils.copyProperties(room,roomVo);
            roomVos.add(roomVo);
        }
        return roomVos;
    }

    @Override
    public int delById(String roomId) {
        return buildingRoomMapper.deleteByPrimaryKey(roomId);
    }

    @Override
    public int updateById(BusinessBuildingRoomDto roomDto) {
        BusinessBuildingRoom room=new BusinessBuildingRoom();
        BeanUtils.copyProperties(roomDto,room);
        return buildingRoomMapper.updateByPrimaryKeySelective(room);
    }

    @Override
    @Transactional
    public PageInfo findAll(Integer page,Integer size) {
        if (page==null ){ page=1;}
        if (size==null ){ size=5;}
        PageHelper.startPage(page,size);
        List<BusinessBuildingRoom> rooms = buildingRoomMapper.selectAll();
        List<BusinessBuildingRoomVo> roomVos=new ArrayList<>();
        for (BusinessBuildingRoom room:rooms) {
            BusinessBuildingRoomVo roomVo=new BusinessBuildingRoomVo();
            BeanUtils.copyProperties(room,roomVo);
            BusinessBuildingUnitVo unitVo = unitService.findById(room.getUnitId());
            BusinessFloorVo floorVo = floorService.findById(unitVo.getFloorId());
            unitVo.setFloorVo(floorVo);
            roomVo.setBuildingUnitVo(unitVo);
            roomVos.add(roomVo);
        }
        PageInfo<BusinessBuildingRoomVo> pageInfo= new PageInfo<>(roomVos);
        return pageInfo;
    }
}
