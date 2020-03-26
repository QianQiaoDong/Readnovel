package com.Controller;

import java.util.List;
import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Model.noveldetails;
import com.Model.novellist;
import com.Model.user;
import com.Service.impl.Novellistsimpl;
import com.Service.impl.ReadServiceimpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Controller
public class ReadController {

	@Autowired
	ReadServiceimpl readServiceimpl;
	
	@Autowired
	Novellistsimpl novellistimpl;
	/*
	 * @GetMapping("/wapbook") public String Read1(noveldetails noveldetails) {
	 * 
	 * return "Login";
	 * 
	 * }
	 */

	@GetMapping("/wapbook")
	public String AllNovel(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum)
	{
		 PageHelper.startPage(pageNum,5);
		 List<noveldetails> list=readServiceimpl.getAllnovels();
		 PageInfo<noveldetails> pageInfo = new PageInfo<noveldetails>(list);
		 model.addAttribute("pageInfo",pageInfo);
		return "Read";
	}
	
	@GetMapping("/chapter")
	public String ShowChapter(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,@RequestParam(value = "nid")Integer nid)
	{
		 PageHelper.startPage(pageNum,10);
		 List<noveldetails> list=readServiceimpl.getChapters(nid);
		 novellist novel=novellistimpl.getNovel(nid);
		 readServiceimpl.Amount(nid);
		 System.out.println(novel);
		 PageInfo<noveldetails> pageInfo = new PageInfo<noveldetails>(list);
		 model.addAttribute("pageInfo",pageInfo);
		 model.addAttribute("novel",novel);
		return "NovelDetail";
	}
	
	@ResponseBody
	@GetMapping("/chapter2")
	public List<noveldetails> ShowChapter2(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum)
	{
		PageHelper.startPage(pageNum,5);
		 List<noveldetails> list=readServiceimpl.getAllnovels();
		 PageInfo<noveldetails> pageInfo = new PageInfo<noveldetails>(list);
		 model.addAttribute("pageInfo",pageInfo);
		return list;
	}
	
	@GetMapping("/chapter1")
	public String ShowChapter1()
	{
		
		return "chapter1";
	}
	
	@GetMapping("/content")
	public String ShowContent(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,@RequestParam(value = "nid")Integer nid,@RequestParam(value = "cid")Integer cid)
	{
		 
		 List<noveldetails> list=readServiceimpl.getText(nid, cid);
		for (noveldetails tmp:list) {
			System.out.print(tmp.getContent());
		}
		 novellist novel=novellistimpl.getNovel(nid);
		 model.addAttribute("novel",novel);
		 PageInfo<noveldetails> pageInfo = new PageInfo<noveldetails>(list);
		 model.addAttribute("pageInfo",pageInfo);
		return "content";
	}
	
}
