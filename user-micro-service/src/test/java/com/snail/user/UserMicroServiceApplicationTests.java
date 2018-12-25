package com.snail.user;

import com.snail.user.entity.SysUser;
import com.snail.user.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMicroServiceApplicationTests {

    @Resource
    SysUserMapper sysUserMapper;

    @Test
    public void contextLoads() {
        SysUser sysUser = sysUserMapper.selectById(1);
        System.out.println(sysUser);
    }

}

