package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.Model.user;
//import com.Model.userRegiste;
import com.Service.impl.RegisteService;

@Controller
@RequestMapping("/Registe")
public class RegisteController {

	@Autowired
	RegisteService RegisteService;
	
	@GetMapping("/user")
	public String Registe() {
		
		return "register";
		
	}
	@ResponseBody
	@PostMapping("/user")
	public boolean Registe1(@RequestBody user user) {

		return RegisteService.registe(user.getUid(), user.getPwd(),user.getGender());
	//此处为将前端的数据添加到数据库中

	}
}
