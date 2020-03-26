package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Model.noveldetails;
import com.Model.novellist;
import com.Model.user;
import com.Service.impl.NovellistServiceimpl;
import com.Service.impl.ReadServiceimpl;
//import com.Model.userRegiste;
import com.Service.impl.RegisteService;

import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/mindex")
public class mindex {

	
	RegisteService RegisteService;
	@Autowired
	NovellistServiceimpl novellistserviceimpl;
	@RequestMapping("/user")
	public String user(Model model){
		
		
		//加分页插件
		
		
		 List<novellist> list=novellistserviceimpl.Selectnovellist();
		 model.addAttribute("list",list);
		 return "mindex";
		
	}
	@ResponseBody
	@PostMapping("/userRegiste")
	public boolean Registe1(@RequestBody user user) {

		return RegisteService.registe(user.getUid(), user.getPwd(),user.getGender());
	//此处为将前端的数据添加到数据库中

	}
}