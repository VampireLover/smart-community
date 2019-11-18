package com.xiaojun.common.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BusinessParkingSpaceVo {
    /**
    * 车位ID
    */
    private String psId;


    /**
    * 小区ID
    */
    private String communityId;

    /**
    * 车位编号
    */
    private String num;

    /**
    * 车位类型,地上停车位1001 地下停车位 2001
    */
    private String typeCd;

    /**
    * 车位状态 出售 S，出租 H ，空闲 F
    */
    private String state;

    /**
    * 车位面积
    */
    private BigDecimal area;

    /**
    * 用户ID
    */
    private String userId;


}