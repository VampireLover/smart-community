package com.xiaojun.common.service;

import com.xiaojun.common.domain.dto.BusinessBuildingRoomDto;
import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;

/**
 * @author 小二哥哥
 */
public interface BusinessBuildingRoomService {
    public BusinessBuildingRoomVo findInfoById(String roomId);
}
