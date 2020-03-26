package com.Controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Model.novellist;
import com.Service.impl.BookSaveServiceimpl;
import com.Service.impl.NovellistServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.Service.impl.Novellistsimpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.Model.novellist;
import com.Model.user;


@Controller
@RequestMapping("/UIndex")
public class UIndexController {
	@Autowired
	Novellistsimpl novellistimpls;
	@Autowired
    NovellistServiceimpl novellistserviceimpl;

	
	@GetMapping("/user")
	public String Index(user user) {
		return "uindex";
		
	}
	@GetMapping("/uuuu")
	public String IndexNovel(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum)
	{ 
		PageHelper.startPage(pageNum,6);
		 List<novellist> list=novellistimpls.Novellists();
		 PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		 model.addAttribute("pageInfo",pageInfo);
		
		 return "uindex";
	}
	
	
	@GetMapping("/AllProducts")
	public String AllProducts(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
		PageHelper.startPage(pageNum,6);
		List<novellist> list=novellistserviceimpl.Selectnovellist();
		PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		 model.addAttribute("pageInfo",pageInfo);
		return "AllProducts";
	}
	@GetMapping("/XuanHuan")
	public String XuanHuan(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
		PageHelper.startPage(pageNum,6);
		List<novellist> list=novellistserviceimpl.SelectnovellistByXuanHuan();
		PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		model.addAttribute("pageInfo",pageInfo);
		
		return "XuanHuan";
		
	}
	@GetMapping("/XuanYi")
	public String XuanYi(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
		PageHelper.startPage(pageNum,6);
		List<novellist> list=novellistserviceimpl.SelectnovellistByXuanYi();
		PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		model.addAttribute("pageInfo",pageInfo);
		return "XuanYi";
		
	}
	@GetMapping("/DuShi")
	public String DuShi(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
		PageHelper.startPage(pageNum,6);
		List<novellist> list=novellistserviceimpl.SelectnovellistByDuShi();
		PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		model.addAttribute("pageInfo",pageInfo);
		return "DuShi";
		
	}
	@GetMapping("/AiQing")
	public String AiQing(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
		PageHelper.startPage(pageNum,6);
		List<novellist> list=novellistserviceimpl.SelectnovellistByAiQing();
		PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		model.addAttribute("pageInfo",pageInfo);
		return "AiQing";
		
	}
	@GetMapping("/KeHuan")
	public String KeHuan(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
		PageHelper.startPage(pageNum,6);
		List<novellist> list=novellistserviceimpl.SelectnovellistByKeHuan();
		PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		model.addAttribute("pageInfo",pageInfo);
		return "KeHuan";
		
	}
	@GetMapping("/LiShi")
	public String LiShi(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
		PageHelper.startPage(pageNum,6);
		List<novellist> list=novellistserviceimpl.SelectnovellistByLiShi();
		PageInfo<novellist> pageInfo = new PageInfo<novellist>(list);
		model.addAttribute("pageInfo",pageInfo);
		return "LiShi";
		
	}

	@GetMapping("/MyShelf")
	public String MyShelf(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,@RequestParam(value = "uid")String uid) {
		 
		return "MyShelf";
		
	}
	}
