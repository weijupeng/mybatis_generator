package com.wjp.dao.shiro.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BenefitsCouponType {
    private Long id;

    private String couponName;

    private Byte couponType;

    private BigDecimal couponAmount;

    private Integer userReceiveNumLimit;

    private BigDecimal applyLimitAmount;

    private String expireTime;

    private String couponDesc;

    private Boolean isValid;

    private Boolean isDeleted;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Byte getCouponType() {
        return couponType;
    }

    public void setCouponType(Byte couponType) {
        this.couponType = couponType;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getUserReceiveNumLimit() {
        return userReceiveNumLimit;
    }

    public void setUserReceiveNumLimit(Integer userReceiveNumLimit) {
        this.userReceiveNumLimit = userReceiveNumLimit;
    }

    public BigDecimal getApplyLimitAmount() {
        return applyLimitAmount;
    }

    public void setApplyLimitAmount(BigDecimal applyLimitAmount) {
        this.applyLimitAmount = applyLimitAmount;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}