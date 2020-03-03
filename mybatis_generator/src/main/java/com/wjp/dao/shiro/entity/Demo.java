package com.wjp.dao.shiro.entity;

import java.util.Date;

/**
 * @author weijupeng
 */
public class Demo {
    private Long id;

    private String enumType;

    private String enumCode;

    private Byte codeType;

    private String enumName;

    private String enumDescription;

    private String enumAttribute;

    private Byte status;

    private Short sortNo;

    private Byte isDelete;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnumType() {
        return enumType;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public String getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(String enumCode) {
        this.enumCode = enumCode;
    }

    public Byte getCodeType() {
        return codeType;
    }

    public void setCodeType(Byte codeType) {
        this.codeType = codeType;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getEnumDescription() {
        return enumDescription;
    }

    public void setEnumDescription(String enumDescription) {
        this.enumDescription = enumDescription;
    }

    public String getEnumAttribute() {
        return enumAttribute;
    }

    public void setEnumAttribute(String enumAttribute) {
        this.enumAttribute = enumAttribute;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Short getSortNo() {
        return sortNo;
    }

    public void setSortNo(Short sortNo) {
        this.sortNo = sortNo;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}