package com.example.demo.dao;

import com.example.demo.model.Ojuser;

public interface OjuserMapper {
    int deleteByPrimaryKey(String username);

    int insert(Ojuser record);

    int insertSelective(Ojuser record);

    Ojuser selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Ojuser record);

    int updateByPrimaryKeyWithBLOBs(Ojuser record);

    int updateByPrimaryKey(Ojuser record);
}