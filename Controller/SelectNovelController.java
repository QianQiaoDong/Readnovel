package com.Controller;


import com.Service.impl.Novellistsimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/select")
public class SelectNovelController {
    @Autowired
    Novellistsimpl novellistsimpl;
   @GetMapping("/find")
    public String  selectNovel(){
      return "find";
    }
    @ResponseBody
    @PostMapping("/showfind")
    public String selectNovel(@RequestParam(value = "info")String info){
      novellistsimpl.selectNovel(info);
       return "showfind";
    }

}
