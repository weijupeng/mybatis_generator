package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.PromotionResult;

public interface PromotionResultMapper {
    int insert(PromotionResult record);

    int insertSelective(PromotionResult record);
}