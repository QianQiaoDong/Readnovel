package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Model.noveldetails;
import com.Model.novellist;
import com.Service.impl.Novellistsimpl;
import com.Service.impl.ReadServiceimpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Controller
public class NovelListController {


		@Autowired
	Novellistsimpl novellistimpl;
		
		/*
		 * @GetMapping("/wapbook") public String Read1(noveldetails noveldetails) {
		 * 
		 * return "Login";
		 * 
		 * }
		 */
		@GetMapping("/mainpage")
		public String Swift()
		{
			return "index";
		}

		
		@GetMapping("/home")
		public String home()
		{
			return "uindex";
		}
		@GetMapping("/Novellist")
		public String AllNovel(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum)
		{
			 PageHelper.startPage(pageNum,5);
			 List<novellist> list=novellistimpl.Novellists();
			 
			 PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
			 model.addAttribute("pageInfo",pageInfo);
			return "Novellist";
		}
}
