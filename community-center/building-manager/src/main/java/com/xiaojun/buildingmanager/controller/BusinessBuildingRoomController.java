package com.xiaojun.buildingmanager.controller;

import com.github.pagehelper.PageInfo;
import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingRoom;
import com.xiaojun.buildingmanager.service.RoomService;
import com.xiaojun.common.bean.ResponseResult;
import com.xiaojun.common.domain.dto.BusinessBuildingRoomDto;
import com.xiaojun.common.service.BusinessBuildingRoomService;
import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小二哥哥
 */
@RestController
@CrossOrigin
@RequestMapping("/room")
public class BusinessBuildingRoomController {
    @Resource
    private BusinessBuildingRoomService buildingRoomService;
    @Resource
    RoomService roomService;

    @RequestMapping(value = "/addRoom",method = {RequestMethod.POST})
    public BusinessBuildingRoom addRoom(@RequestBody  BusinessBuildingRoomDto buildingRoomDto){
        roomService.addRoom(buildingRoomDto);
        return null;
    }

    @RequestMapping(value = "/findInfoById/{roomId}")
    public ResponseResult findInfoById( @PathVariable String roomId){
        BusinessBuildingRoomVo roomVo = buildingRoomService.findInfoById(roomId);
        return ResponseResult.success(roomVo);
    }

    @RequestMapping(value = "/findAll")
    public ResponseResult findAll(Integer page,Integer size ){
        PageInfo pageInfo = roomService.findAll(page, size);
        return ResponseResult.success(pageInfo);
    }

    @RequestMapping(value = "/findRoomByUnit")
    public ResponseResult findRoomByUnit(String unitId){
        List<BusinessBuildingRoomVo> roomByUnit = roomService.findRoomByUnit(unitId);
        return ResponseResult.success(roomByUnit);
    }

    @RequestMapping(value = "/findRoomByUser")
    public List<BusinessBuildingRoomVo> findRoomByUser(String userId) {
        List<BusinessBuildingRoomVo> roomVos = roomService.findRoomByUser(userId);
        return roomVos;
    }

    @RequestMapping("/updateById")
    public ResponseResult updateById(@RequestBody BusinessBuildingRoomDto roomDto){
        return ResponseResult.success(roomService.updateById(roomDto));
    }

    @RequestMapping("/delById")
    public ResponseResult delById(String roomId){
      return ResponseResult.success(roomService.delById(roomId));
    }
}
