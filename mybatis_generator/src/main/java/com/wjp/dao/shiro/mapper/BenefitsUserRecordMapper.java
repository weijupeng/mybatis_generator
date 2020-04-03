package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.BenefitsUserRecord;

public interface BenefitsUserRecordMapper {
    int insert(BenefitsUserRecord record);

    int insertSelective(BenefitsUserRecord record);
}