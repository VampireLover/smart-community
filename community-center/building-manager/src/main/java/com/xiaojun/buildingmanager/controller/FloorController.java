package com.xiaojun.buildingmanager.controller;

import com.github.pagehelper.PageInfo;
import com.xiaojun.buildingmanager.service.FloorService;
import com.xiaojun.common.bean.ResponseResult;
import com.xiaojun.common.domain.vo.BusinessFloorVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小二哥哥
 */
@RestController
@CrossOrigin
@RequestMapping("/floor")
public class FloorController {
    @Resource
    FloorService floorService;

    @RequestMapping("/findAll")
    public ResponseResult findAll(Integer page,Integer size){
        PageInfo floorVos = floorService.findAll(page, size);
        return ResponseResult.success(floorVos);
    }

    @RequestMapping("/findById")
    protected ResponseResult findById(@RequestParam("floodId") String floodId){
        BusinessFloorVo floorVo = floorService.findById(floodId);
        return ResponseResult.success(floorVo);
    }
}
