package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.BenefitsOrderPayment;

public interface BenefitsOrderPaymentMapper {
    int insert(BenefitsOrderPayment record);

    int insertSelective(BenefitsOrderPayment record);
}