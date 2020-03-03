package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.PromotionPlan;

public interface PromotionPlanMapper {
    int insert(PromotionPlan record);

    int insertSelective(PromotionPlan record);
}