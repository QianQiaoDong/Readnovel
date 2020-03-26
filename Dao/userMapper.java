package com.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.Model.user;

@Mapper
public interface userMapper {
    int deleteByPrimaryKey(String uid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
    
   

	user Selectuser(String uid, String pwd);
}