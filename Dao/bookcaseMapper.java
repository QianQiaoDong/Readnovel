package com.Dao;

import com.Model.bookcase;
import org.apache.ibatis.annotations.Param;

public interface bookcaseMapper {
    int deleteByPrimaryKey(@Param("uid") String uid, @Param("nid") Integer nid);

    int insert(bookcase record);

    int insertSelective(bookcase record);

    bookcase selectByPrimaryKey(@Param("uid") String uid, @Param("nid") Integer nid);

    int updateByPrimaryKeySelective(bookcase record);

    int updateByPrimaryKey(bookcase record);
}