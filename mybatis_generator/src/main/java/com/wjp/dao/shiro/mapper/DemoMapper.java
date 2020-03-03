package com.wjp.dao.shiro.mapper;

import com.wjp.dao.shiro.entity.Demo;

public interface DemoMapper {
    int insert(Demo record);

    int insertSelective(Demo record);
}