package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.PromotionRecord;

public interface PromotionRecordMapper {
    int insert(PromotionRecord record);

    int insertSelective(PromotionRecord record);
}