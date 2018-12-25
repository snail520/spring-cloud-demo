package com.snail.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * Created by gaoxiang on 18/12/25.
 */

@Data
public class SysUser {
    private int id;
    @TableField("userAccount")
    private String userAccount;
    private String password;
    private String state;
    @TableField("userName")
    private String userName;
    @TableField("userRole")
    private String userRole;
    @TableField("userType")
    private String userType;
    @TableField("userHeadUrl")
    private String userHeadUrl;
    @TableField("provinceCode")
    private String provinceCode;
    @TableField("provinceName")
    private String provinceName;
    @TableField("cityCode")
    private String cityCode;
    @TableField("cityName")
    private String cityName;
    @TableField("countryCode")
    private String countryCode;
    @TableField("countryName")
    private String countryName;
    @TableField("openId")
    private String openId;
    @TableField("createTime")
    private String createTime;
}
