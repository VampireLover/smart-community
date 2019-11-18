package com.xiaojun.buildingmanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaojun.buildingmanager.domain.entity.BusinessFloor;
import com.xiaojun.buildingmanager.mapper.BusinessFloorMapper;
import com.xiaojun.buildingmanager.service.FloorService;
import com.xiaojun.common.domain.vo.BusinessFloorVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class FloorServiceImpl implements FloorService {
    @Resource
    BusinessFloorMapper floorMapper;

    @Override
    public BusinessFloorVo findById(String floorId) {
        BusinessFloor floor = floorMapper.selectById(floorId);
        BusinessFloorVo floorVo=new BusinessFloorVo();
        BeanUtils.copyProperties(floor,floorVo);
        return floorVo;
    }

    @Override
    public PageInfo findAll(Integer page, Integer size) {
        if (page==null ){ page=1;}
        if (size==null ){ size=5;}
        PageHelper.startPage(page,size);
        List<BusinessFloorVo> floorVos=new ArrayList<>();
        List<BusinessFloor> floors = floorMapper.selectAll();
        for (BusinessFloor floor:floors) {
            BusinessFloorVo floorVo=new BusinessFloorVo();
            BeanUtils.copyProperties(floor,floorVo);
            floorVos.add(floorVo);
        }
        PageInfo<BusinessFloorVo> floorVoPageInfo =new PageInfo<>(floorVos);
        return floorVoPageInfo;
    }
}
