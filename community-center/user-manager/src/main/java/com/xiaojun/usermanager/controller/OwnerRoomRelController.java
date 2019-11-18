package com.xiaojun.usermanager.controller;


import com.xiaojun.common.bean.ResponseResult;
import com.xiaojun.common.domain.vo.BusinessBuildingOwnerRoomRelVO;
import com.xiaojun.usermanager.service.BusinessBuildingOwnerRoomRelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小二哥哥
 */
@RestController
@RequestMapping("/rel")
public class OwnerRoomRelController {

    @Resource
    BusinessBuildingOwnerRoomRelService roomRelService;

    @RequestMapping("/findByOwnerId")
    public ResponseResult findByOwnerId(Integer ownerId){
        List<BusinessBuildingOwnerRoomRelVO> relVos = roomRelService.findByOwnerId(ownerId);
        return ResponseResult.success(relVos);
    }

}