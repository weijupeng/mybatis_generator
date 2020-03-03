package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.PromotionEnum;

public interface PromotionEnumMapper {
    int insert(PromotionEnum record);

    int insertSelective(PromotionEnum record);
}