package com.xiaojun.common.domain.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author 小二哥哥
 */
@Data
public class BusinessUserVo {


    /**
    * 用户ID
    */
    private String userId;

    /**
    * 名称
    */
    private String name;

    public List<BusinessBuildingRoomVo> roomVos;
    /**
    * 邮箱地址
    */
    private String email;

    /**
    * 现居住地址
    */
    private String address;

    /**
    * 用户密码，加密过后
    */
    private String password;

    /**
    * 用户地区
    */
    private String locationCd;

    /**
    * 用户年龄
    */
    private Integer age;

    private String sex;

    private String tel;

    /**
    * 用户级别,关联user_level
    */
    private String levelCd;

}