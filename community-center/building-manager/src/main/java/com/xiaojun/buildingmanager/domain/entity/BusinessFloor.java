package com.xiaojun.buildingmanager.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class BusinessFloor {
    /**
     * 楼ID
     */
    private String floorId;

    /**
     * 业务Id
     */
    private String bId;

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

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 数据状态，添加ADD，修改MOD 删除DEL
     */
    private String operate;
}