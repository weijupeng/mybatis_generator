package com.wjp.dao.shiro.entity;

import java.util.Date;

public class PromotionPlan {
    private Long id;

    private String planName;

    private String planDesc;

    private Byte promoteMode;

    private String promoteSystem;

    private Integer delayTime;

    private Byte ruleType;

    private String kieSessionId;

    private Byte isValid;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanDesc() {
        return planDesc;
    }

    public void setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
    }

    public Byte getPromoteMode() {
        return promoteMode;
    }

    public void setPromoteMode(Byte promoteMode) {
        this.promoteMode = promoteMode;
    }

    public String getPromoteSystem() {
        return promoteSystem;
    }

    public void setPromoteSystem(String promoteSystem) {
        this.promoteSystem = promoteSystem;
    }

    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public Byte getRuleType() {
        return ruleType;
    }

    public void setRuleType(Byte ruleType) {
        this.ruleType = ruleType;
    }

    public String getKieSessionId() {
        return kieSessionId;
    }

    public void setKieSessionId(String kieSessionId) {
        this.kieSessionId = kieSessionId;
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
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