package com.Dao;

import com.Model.reviewerror;

public interface reviewerrorMapper {
    int deleteByPrimaryKey(Integer reid);

    int insert(reviewerror record);

    int insertSelective(reviewerror record);

    reviewerror selectByPrimaryKey(Integer reid);

    int updateByPrimaryKeySelective(reviewerror record);

    int updateByPrimaryKey(reviewerror record);
}