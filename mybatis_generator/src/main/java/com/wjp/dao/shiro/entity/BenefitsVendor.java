package com.wjp.dao.shiro.entity;

import java.util.Date;

public class BenefitsVendor {
    private Long id;

    private String vendorName;

    private String vendorCode;

    private Byte vendorType;

    private String vendorContractNo;

    private Boolean isDeleted;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public Byte getVendorType() {
        return vendorType;
    }

    public void setVendorType(Byte vendorType) {
        this.vendorType = vendorType;
    }

    public String getVendorContractNo() {
        return vendorContractNo;
    }

    public void setVendorContractNo(String vendorContractNo) {
        this.vendorContractNo = vendorContractNo;
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