package com.wjp.dao.shiro.entity;

import java.util.Date;

public class BenefitsUserRecord {
    private Long id;

    private Long userId;

    private Long typeId;

    private Long orderId;

    private Byte userSource;

    private String expriedTime;

    private String startTime;

    private Byte isFirstBeVip;

    private Byte isAutoRenew;

    private Byte userStatus;

    private Boolean isDeleted;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getUserSource() {
        return userSource;
    }

    public void setUserSource(Byte userSource) {
        this.userSource = userSource;
    }

    public String getExpriedTime() {
        return expriedTime;
    }

    public void setExpriedTime(String expriedTime) {
        this.expriedTime = expriedTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Byte getIsFirstBeVip() {
        return isFirstBeVip;
    }

    public void setIsFirstBeVip(Byte isFirstBeVip) {
        this.isFirstBeVip = isFirstBeVip;
    }

    public Byte getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Byte isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
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