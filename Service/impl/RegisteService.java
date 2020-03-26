package com.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.userMapper;
import com.Model.user;
import com.Service.Registe;
@Service
public class RegisteService implements Registe {
@Autowired
userMapper userMapper;

@Autowired
user user;

@Override
public Boolean registe(String uid, String pwd,Integer gender) {
user temp = userMapper.selectByPrimaryKey(uid);
	
	if (temp != null) {
		return false;
	}
	user user = new user();
	user.setUid(uid);
	user.setIdentity(1);
	user.setPwd(pwd);
	user.setGender(gender.intValue());
	return userMapper.insert(user) > 0;
	}
}