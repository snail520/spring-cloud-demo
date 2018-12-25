package com.snail.user.entity;

import com.snail.user.utils.SuperEntity;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author snail
 * @since 2018-12-25
 */
public class SysUser extends SuperEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     */
    @TableField("userAccount")
    private String userAccount;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态：0正常；1不正常
     */
    private String state;

    /**
     * 用户名称
     */
    @TableField("userName")
    private String userName;

    /**
     * 用户角色[对应sys_role里的id]
     */
    @TableField("userRole")
    private String userRole;

    /**
     * 用户类型[0:电信渠道 1:互联网2:体验用户导入]
     */
    @TableField("userType")
    private String userType;

    /**
     * 用户头像
     */
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

    /**
     * 微信用户openId
     */
    @TableField("openId")
    private String openId;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private String createTime;

    public String getUserAccount() {
        return userAccount;
    }

    public SysUser setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getPassword() {
        return password;
    }

    public SysUser setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getState() {
        return state;
    }

    public SysUser setState(String state) {
        this.state = state;
        return this;
    }
    public String getUserName() {
        return userName;
    }

    public SysUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserRole() {
        return userRole;
    }

    public SysUser setUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }
    public String getUserType() {
        return userType;
    }

    public SysUser setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserHeadUrl() {
        return userHeadUrl;
    }

    public SysUser setUserHeadUrl(String userHeadUrl) {
        this.userHeadUrl = userHeadUrl;
        return this;
    }
    public String getProvinceCode() {
        return provinceCode;
    }

    public SysUser setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public SysUser setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }
    public String getCityCode() {
        return cityCode;
    }

    public SysUser setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityName() {
        return cityName;
    }

    public SysUser setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public SysUser setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryName() {
        return countryName;
    }

    public SysUser setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    public String getOpenId() {
        return openId;
    }

    public SysUser setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getCreateTime() {
        return createTime;
    }

    public SysUser setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "userAccount=" + userAccount +
        ", password=" + password +
        ", state=" + state +
        ", userName=" + userName +
        ", userRole=" + userRole +
        ", userType=" + userType +
        ", userHeadUrl=" + userHeadUrl +
        ", provinceCode=" + provinceCode +
        ", provinceName=" + provinceName +
        ", cityCode=" + cityCode +
        ", cityName=" + cityName +
        ", countryCode=" + countryCode +
        ", countryName=" + countryName +
        ", openId=" + openId +
        ", createTime=" + createTime +
        "}";
    }
}
