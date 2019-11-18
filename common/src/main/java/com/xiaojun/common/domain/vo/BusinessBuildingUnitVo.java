package com.xiaojun.common.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 小二哥哥
 */
@Data
public class BusinessBuildingUnitVo implements Serializable {
    /**
    * 单元ID
    */
    private String unitId;


    /**
    * 单元编号
    */
    private String unitNum;

    /**
    * 楼ID
    */
    private String floorId;

    BusinessFloorVo floorVo;
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
    * 数据状态，添加ADD，修改MOD 删除DEL
    */
    private String operate;
}