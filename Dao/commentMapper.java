package com.Dao;

import com.Model.comment;

public interface commentMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(comment record);

    int insertSelective(comment record);

    comment selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(comment record);

    int updateByPrimaryKey(comment record);
}