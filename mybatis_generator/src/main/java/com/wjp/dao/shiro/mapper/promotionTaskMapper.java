package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.promotionTask;

public interface promotionTaskMapper {
    int insert(promotionTask record);

    int insertSelective(promotionTask record);
}