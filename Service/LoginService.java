package com.Service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;


import com.Model.user;

@Service
public interface LoginService {
	
 public user SelectUser(String uid,String pwd,Integer identity);
}
