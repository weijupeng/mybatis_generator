package com.wjp.dao.shiro.entity;

import java.util.Date;

public class BenefitsCouponVendor {
    private Long id;

    private Long couponTypeId;

    private Long vendorId;

    private String couponVendorCode;

    private String couponVendorUrl;

    private Boolean isDeleted;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponTypeId() {
        return couponTypeId;
    }

    public void setCouponTypeId(Long couponTypeId) {
        this.couponTypeId = couponTypeId;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getCouponVendorCode() {
        return couponVendorCode;
    }

    public void setCouponVendorCode(String couponVendorCode) {
        this.couponVendorCode = couponVendorCode;
    }

    public String getCouponVendorUrl() {
        return couponVendorUrl;
    }

    public void setCouponVendorUrl(String couponVendorUrl) {
        this.couponVendorUrl = couponVendorUrl;
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