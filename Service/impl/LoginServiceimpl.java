package com.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.userMapper;
import com.Model.user;
import com.Service.LoginService;
@Service
public class LoginServiceimpl implements LoginService {
@Autowired
userMapper userMapper;
	@Override
	public user SelectUser(String uid,String pwd,Integer identity) {
		user user=userMapper.Selectuser(uid, pwd);
		Integer temp=user.getIdentity();
		if(temp==identity) {
			return user;
		}
		else
			return null;
		}
		
	}


	

