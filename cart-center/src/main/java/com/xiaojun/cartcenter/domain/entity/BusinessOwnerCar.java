package com.xiaojun.cartcenter.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class BusinessOwnerCar {
    /**
    * 汽车ID
    */
    private String carId;

    /**
    * 业主ID
    */
    private String ownerId;

    /**
    * 业务Id
    */
    private String bId;

    /**
    * 车牌号
    */
    private String carNum;

    /**
    * 汽车品牌
    */
    private String carBrand;

    /**
    * 9901 家用小汽车，9902 客车，9903 货车
    */
    private String carType;

    /**
    * 颜色
    */
    private String carColor;

    /**
    * 车位ID
    */
    private String psId;

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