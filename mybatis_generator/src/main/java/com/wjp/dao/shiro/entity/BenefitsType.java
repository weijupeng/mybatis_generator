package com.wjp.dao.shiro.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BenefitsType {
    private Long id;

    private Byte benefitsLevel;

    private Byte benefitsType;

    private BigDecimal benefitsFee;

    private Integer expires;

    private Boolean isDeleted;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getBenefitsLevel() {
        return benefitsLevel;
    }

    public void setBenefitsLevel(Byte benefitsLevel) {
        this.benefitsLevel = benefitsLevel;
    }

    public Byte getBenefitsType() {
        return benefitsType;
    }

    public void setBenefitsType(Byte benefitsType) {
        this.benefitsType = benefitsType;
    }

    public BigDecimal getBenefitsFee() {
        return benefitsFee;
    }

    public void setBenefitsFee(BigDecimal benefitsFee) {
        this.benefitsFee = benefitsFee;
    }

    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
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