package com.snail.user.service;

import com.snail.user.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.snail.user.service.impl.SysUserServiceImpl;
//import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author snail
 * @since 2018-12-25
 */
//@FeignClient(name = "user-micro-service",fallback = SysUserServiceImpl.class)
public interface ISysUserService extends IService<SysUser> {

}
