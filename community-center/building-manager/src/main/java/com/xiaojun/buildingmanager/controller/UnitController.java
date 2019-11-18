package com.xiaojun.buildingmanager.controller;

import com.github.pagehelper.PageInfo;
import com.xiaojun.buildingmanager.service.UnitService;
import com.xiaojun.common.bean.ResponseResult;
import com.xiaojun.common.domain.dto.BusinessBuildingUnitDto;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 小二哥哥
 */
@RestController
@CrossOrigin
@RequestMapping("/unit")
public class UnitController {
    @Resource
    UnitService unitService;

    @RequestMapping("/findAll")
    public ResponseResult findAll(Integer page,Integer size){
        PageInfo pageInfo = unitService.findAll(page, size);
        return ResponseResult.success(pageInfo);
    }

    @RequestMapping("/delById")
    public ResponseResult delById(@RequestParam("unitId") String unitId) {
        return ResponseResult.success( unitService.delById(unitId));
    }

    @RequestMapping("/updateById")
    public ResponseResult updateById(@RequestBody BusinessBuildingUnitDto unitDto){
        return ResponseResult.success(unitService.updateById(unitDto));
    }

    @RequestMapping("/findByFlor")
    public ResponseResult findByFlor(String floorId){
        return ResponseResult.success(unitService.findByFloor(floorId));
    }

}
