package com.xiaojun.usermanager.service.impl;

import com.xiaojun.common.domain.vo.BusinessBuildingOwnerRoomRelVO;
import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;
import com.xiaojun.common.service.BusinessBuildingRoomService;
import com.xiaojun.usermanager.domain.entity.BusinessBuildingOwnerRoomRel;
import com.xiaojun.usermanager.mapper.BusinessBuildingOwnerRoomRelMapper;
import com.xiaojun.usermanager.service.BusinessBuildingOwnerRoomRelService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小二哥哥
 */
@Service
public class BusinessBuildingOwnerRoomRelServiceImpl implements BusinessBuildingOwnerRoomRelService {
    @Resource
    BusinessBuildingOwnerRoomRelMapper ownerRoomRelMapper;

    @Reference
    private BusinessBuildingRoomService  roomService;

    @Override
    @Transactional
    public List<BusinessBuildingOwnerRoomRelVO> findByOwnerId(Integer ownerId) {
        List<BusinessBuildingOwnerRoomRelVO> ownerRoomRelVos =new ArrayList<>();
        List<BusinessBuildingOwnerRoomRel> ownerRoomRels = ownerRoomRelMapper.selectByownerId(ownerId);
        for (BusinessBuildingOwnerRoomRel rel: ownerRoomRels) {
            BusinessBuildingOwnerRoomRelVO relVO=new BusinessBuildingOwnerRoomRelVO();
            BeanUtils.copyProperties(rel,relVO);
            BusinessBuildingRoomVo roomVo = roomService.findInfoById(rel.getRoomId().toString());
            relVO.setBuildingRoomVo(roomVo);
            ownerRoomRelVos.add(relVO);
        }
        return ownerRoomRelVos;
    }
}
