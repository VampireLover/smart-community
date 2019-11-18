package com.xiaojun.cartcenter.mapper;

import com.xiaojun.cartcenter.domain.entity.BusinessOwnerCar;

public interface BusinessOwnerCarMapper {
    int insert(BusinessOwnerCar record);

    int insertSelective(BusinessOwnerCar record);
}