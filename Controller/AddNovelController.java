package com.Controller;

import com.Model.noveldetails;
import com.Model.novellist;
import com.Service.impl.BookSaveServiceimpl;
import com.Service.impl.ReadServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/mindex")
public class AddNovelController {
    @Autowired
    private BookSaveServiceimpl bookSaveServiceimpl;


	@Autowired
	ReadServiceimpl readServiceimpl;
    @GetMapping("/onshelf")
    public String insertBook()
    {
        return "onshelf";
    }

    @ResponseBody
    @PostMapping("/onshelf")
    public Boolean insertBook2(@RequestBody novellist book)
    {
        return bookSaveServiceimpl.insertBook2(book.getNid(),book.getNname(),book.getNkind(),book.getAuthor(),book.getAmount(),book.getBrief(),book.getColamount(),book.getCovers())>0;
    }


    @GetMapping("/insert")
    public String indexAndContentSave(Model model, @RequestParam(value = "nid")Integer nid)
    {
    	List<noveldetails> list=readServiceimpl.getChapters(nid);
		 model.addAttribute("list",list);
        return "addchapter";

    }
    /**
     * 保存章节
     * 插入成功返回继续插入章节的界面
     * 插入失败返回erro界面
     */
    @ResponseBody
    @PostMapping("/insert")
    public Boolean indexAndContentSave1(@RequestBody noveldetails noveldetails) {
    	
            return bookSaveServiceimpl.indexAndContentSave1(noveldetails) > 0;
    }

}
