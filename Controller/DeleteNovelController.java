package com.Controller;

import com.Service.impl.BookSaveServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mindex")
public class DeleteNovelController {
    @Autowired
    BookSaveServiceimpl bookSaveServiceimpl;
    /*
    *删除小说
    * alreadydown是删除成功界面
    *
    */
   @GetMapping("/downshelf")
    public String deleteByNName (){
       return "downshelf";
   }
   @PostMapping("/downshelf")
   @ResponseBody
    public String deleteByPrimaryKey(@RequestParam (value = "nid")Integer nid){
       bookSaveServiceimpl.deleteByPrimaryKey(nid);
      return "mindex";
   }
   /*
   删除小说章节
    */
   @GetMapping("/delcontent")
    public String deleteContent(){
       return "/delcontent";
   }
   @PostMapping("/delcontent")
   @ResponseBody
    public String deleteContent(@RequestParam (value = "nid")Integer nid,@RequestParam (value = "chapter")String chapter){
       if (bookSaveServiceimpl.deleteByPrimaryContent(nid,chapter)>0){
           return "/alreadydown";
       }
       return "mindex";
   }

}
