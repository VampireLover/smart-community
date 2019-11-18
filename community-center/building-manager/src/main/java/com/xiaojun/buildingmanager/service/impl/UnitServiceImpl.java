package com.xiaojun.buildingmanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaojun.buildingmanager.domain.entity.BusinessBuildingUnit;
import com.xiaojun.buildingmanager.mapper.BusinessBuildingUnitMapper;
import com.xiaojun.buildingmanager.service.UnitService;
import com.xiaojun.common.domain.dto.BusinessBuildingUnitDto;
import com.xiaojun.common.domain.vo.BusinessBuildingUnitVo;
import com.xiaojun.common.domain.vo.BusinessUserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {

    @Resource
    BusinessBuildingUnitMapper unitMapper;

    @Override
    public int updateById(BusinessBuildingUnitDto unitDto) {
        BusinessBuildingUnit unit=new BusinessBuildingUnit();
        BeanUtils.copyProperties(unitDto,unit);
        return unitMapper.updateByPrimaryKeySelective(unit);
    }

    @Override
    public List<BusinessBuildingUnitVo> findByFloor(String floorId) {
        List<BusinessBuildingUnitVo> unitVos=new ArrayList<>();
        List<BusinessBuildingUnit> units = unitMapper.selectByFloor(floorId);
        for (BusinessBuildingUnit unit:units) {
            BusinessBuildingUnitVo unitVo=new BusinessBuildingUnitVo();
            BeanUtils.copyProperties(unit,unitVo);
            unitVos.add(unitVo);
        }
        return unitVos;
    }

    @Override
    public BusinessBuildingUnitVo findById(String unitId) {
        BusinessBuildingUnitVo unitVo=new BusinessBuildingUnitVo();
        BusinessBuildingUnit unit = unitMapper.selectById(unitId);
        BeanUtils.copyProperties(unit,unitVo);
        return unitVo;
    }

    @Override
    public PageInfo findAll(Integer page, Integer size) {
        if (page==null ){ page=1;}
        if (size==null ){ size=5;}
        PageHelper.startPage(page,size);
        List<BusinessBuildingUnitVo> unitVos =new ArrayList<>();
        List<BusinessBuildingUnit> units = unitMapper.selectAll();
        for (BusinessBuildingUnit unit:units) {
            BusinessBuildingUnitVo unitVo=new BusinessBuildingUnitVo();
            BeanUtils.copyProperties(unit,unitVo);
            unitVos.add(unitVo);
        }
        PageInfo<BusinessBuildingUnitVo> unitVoPageInfo=new PageInfo<>(unitVos);
        return unitVoPageInfo;
    }

    @Override
    public int delById(String unitId) {
        return unitMapper.deleteById(unitId);
    }
}
