package com.xiaojun.usermanager.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class BusinessBuildingOwnerRoomRel {
    /**
    * 关系ID
    */
    private Integer relId;

    /**
    * 业主ID
    */
    private Integer ownerId;

    /**
    * 房间ID
    */
    private Integer roomId;

    /**
    * 业务Id
    */
    private Integer bId;

    /**
    * 业务状态  2001 业主未迁入 2002 业主迁入 2003 业主迁出
    */
    private Integer state;

    /**
    * 用户ID
    */
    private Integer userId;

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