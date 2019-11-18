package com.xiaojun.common.domain.vo;

import lombok.Data;

import java.util.Date;

@Data
public class BusinessFloorVo {
    /**
    * 楼ID
    */
    private String floorId;


    /**
    * 楼编号
    */
    private String floorNum;

    /**
    * 小区楼名称
    */
    private String name;

    /**
    * 用户ID
    */
    private String userId;



}