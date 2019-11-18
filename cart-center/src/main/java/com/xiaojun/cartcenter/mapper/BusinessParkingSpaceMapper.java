package com.xiaojun.cartcenter.mapper;

import com.xiaojun.cartcenter.domain.entity.BusinessParkingSpace;

public interface BusinessParkingSpaceMapper {
    int insert(BusinessParkingSpace record);

    int insertSelective(BusinessParkingSpace record);
}