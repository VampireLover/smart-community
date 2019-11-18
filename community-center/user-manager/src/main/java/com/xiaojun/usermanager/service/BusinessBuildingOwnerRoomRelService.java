package com.xiaojun.usermanager.service;

import com.xiaojun.common.domain.vo.BusinessBuildingOwnerRoomRelVO;

import java.util.List;

public interface BusinessBuildingOwnerRoomRelService {

    List<BusinessBuildingOwnerRoomRelVO> findByOwnerId(Integer ownerId);

}
