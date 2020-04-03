package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.BenefitsOrder;

public interface BenefitsOrderMapper {
    int insert(BenefitsOrder record);

    int insertSelective(BenefitsOrder record);
}