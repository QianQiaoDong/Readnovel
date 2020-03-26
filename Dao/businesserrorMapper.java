package com.Dao;

import com.Model.businesserror;

public interface businesserrorMapper {
    int deleteByPrimaryKey(Integer beid);

    int insert(businesserror record);

    int insertSelective(businesserror record);

    businesserror selectByPrimaryKey(Integer beid);

    int updateByPrimaryKeySelective(businesserror record);

    int updateByPrimaryKey(businesserror record);
}