package com.Controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Model.novellist;
import com.Service.impl.BookSaveServiceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.Service.impl.Novellistsimpl;
import com.Model.novellist;
import com.Model.user;


@Controller
@RequestMapping("/Index")
public class IndexController {
	@Autowired
	Novellistsimpl novellistimpls;
	
	
	@GetMapping("/auser")
	public String Index(user user) {
		return "index";
		
	}
	@GetMapping("/uuuu")
	public String IndexNovel(Model model)
	{ 
		 List<novellist> list=novellistimpls.Novellists();
		 model.addAttribute("list",list);
		 return "index";
	}
	}

