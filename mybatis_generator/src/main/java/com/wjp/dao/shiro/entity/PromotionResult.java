package com.wjp.dao.shiro.entity;

import java.util.Date;

public class PromotionResult {
    private Long id;

    private Long recordId;

    private String executor;

    private Byte executeStatus;

    private String executeLabel;

    private Byte executeResult;

    private String executeResultDesc;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public Byte getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(Byte executeStatus) {
        this.executeStatus = executeStatus;
    }

    public String getExecuteLabel() {
        return executeLabel;
    }

    public void setExecuteLabel(String executeLabel) {
        this.executeLabel = executeLabel;
    }

    public Byte getExecuteResult() {
        return executeResult;
    }

    public void setExecuteResult(Byte executeResult) {
        this.executeResult = executeResult;
    }

    public String getExecuteResultDesc() {
        return executeResultDesc;
    }

    public void setExecuteResultDesc(String executeResultDesc) {
        this.executeResultDesc = executeResultDesc;
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