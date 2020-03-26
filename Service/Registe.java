package com.Service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;


import com.Model.user;

@Service
public interface Registe {
	
 //public user SelectUser(String uid,String pwd);
	//往数据库中存储信息
	
	public Boolean registe(String uid, String pwd,Integer gender); 
	
}
