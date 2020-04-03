package com.wjp.dao.shiro.entity;

import java.util.Date;

public class BenefitsOrderPayment {
    private Long id;

    private Long orderId;

    private Byte paymentChannel;

    private String paymentSequenceNo;

    private Byte paymentStatus;

    private Boolean isDeleted;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(Byte paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentSequenceNo() {
        return paymentSequenceNo;
    }

    public void setPaymentSequenceNo(String paymentSequenceNo) {
        this.paymentSequenceNo = paymentSequenceNo;
    }

    public Byte getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Byte paymentStatus) {
        this.paymentStatus = paymentStatus;
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