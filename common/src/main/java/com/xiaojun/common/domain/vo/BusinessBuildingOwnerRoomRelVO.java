package com.xiaojun.common.domain.vo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * @author 小二哥哥
 */
@Data
public class BusinessBuildingOwnerRoomRelVO implements Serializable {
    /**
     * 关系ID
     */
    private Integer relId;

    /**
     * 业主ID
     */
    private Integer ownerId;


    private BusinessBuildingRoomVo buildingRoomVo;

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
     * 数据状态，添加ADD，修改MOD 删除DEL
     */
    private String operate;

}
