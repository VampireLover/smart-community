package com.xiaojun.common.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BusinessBuildingUnitDto {
    /**
     * 单元ID
     */
    private String unitId;


    /**
     * 单元编号
     */
    private String unitNum;


    /**
     * 总层数
     */
    private Integer layerCount;

    /**
     * 是否有电梯 1010有 2020 无
     */
    private String lift;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 备注
     */
    private String remark;


    /**
     * 数据状态，添加ADD，修改MOD 删除DEL
     */
    private String operate;
}