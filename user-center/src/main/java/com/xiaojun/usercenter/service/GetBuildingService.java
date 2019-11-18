package com.xiaojun.usercenter.service;


import com.xiaojun.common.domain.vo.BusinessBuildingRoomVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;



/**
 * @author 小二哥哥
 */
@FeignClient("building-manager")
public interface GetBuildingService {

    @RequestMapping("/room/findRoomByUser")
    public List<BusinessBuildingRoomVo> findRoomByUser(@RequestParam("userId") String userId);

}
