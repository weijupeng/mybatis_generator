package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.BenefitsType;

public interface BenefitsTypeMapper {
    int insert(BenefitsType record);

    int insertSelective(BenefitsType record);
}