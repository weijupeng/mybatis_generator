package com.wjp.dao.shiro.entity;

import java.util.Date;

public class PromotionOriginal {
    private Long id;

    private String productCode;

    private String eventType;

    private String mobile;

    private Long registerId;

    private Long businessId;

    private Byte source;

    private Long promoteTasksNo;

    private String promoteTasksLabel;

    private String mongoId;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Long registerId) {
        this.registerId = registerId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Long getPromoteTasksNo() {
        return promoteTasksNo;
    }

    public void setPromoteTasksNo(Long promoteTasksNo) {
        this.promoteTasksNo = promoteTasksNo;
    }

    public String getPromoteTasksLabel() {
        return promoteTasksLabel;
    }

    public void setPromoteTasksLabel(String promoteTasksLabel) {
        this.promoteTasksLabel = promoteTasksLabel;
    }

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
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