package com.xiaojun.common.domain.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class BusinessBuildingRoomDto {

    /**
     * 业务Id
     */

    private String bId;

    /**
     * 房屋编号
     */
    private String roomNum;

    /**
     * 单元ID
     */
    private String unitId;

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
     * 用户ID
     */
    private String userId;

}
