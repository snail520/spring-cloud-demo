package com.snail.user.controller;

import com.snail.user.entity.SysUser;
import com.snail.user.service.ISysUserService;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by gaoxiang on 18/12/25.
 */

@RestController
public class UserController {

    @Resource
    private ISysUserService sysUserService;

    @RequestMapping(value = "/print" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String printService(){
        SysUser sysUser = sysUserService.getById(1);
        return sysUser.toString();
    }
}
