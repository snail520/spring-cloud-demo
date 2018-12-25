package com.snail.user.service.impl;

import com.snail.user.entity.SysUser;
import com.snail.user.mapper.SysUserMapper;
import com.snail.user.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author snail
 * @since 2018-12-25
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
