package com.xiaojun.common.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 小二哥哥
 */
@Data
public class BusinessBuildingRoomVo  implements Serializable {
    /**
     * 房屋ID
     */
    private String roomId;

    /**
     * 房屋编号
     */
    private String roomNum;

    private String unitId;

    private String userId;

    private BusinessBuildingUnitVo buildingUnitVo;

    /**
     * 层数
     */
    private Integer layer;

    /**
     * 室
     */
    private Integer section;

    /**
     * 户型
     */
    private String apartment;

    /**
     * 建筑面积
     */
    private BigDecimal builtUpArea;

    /**
     * 每平米单价
     */
    private BigDecimal unitPrice;

    /**
     * 房屋状态，如房屋出售等，请查看state 表
     */
    private String state;

}
