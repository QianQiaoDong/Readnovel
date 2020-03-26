package com.Service.impl;

import com.Dao.noveldetailsMapper;
import com.Dao.novellistMapper;
import com.Model.*;
import com.Service.BookSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.xml.bind.NotIdentifiableEvent;
//import java.util.Date;


@Service("BookSaveService")
public class BookSaveServiceimpl implements BookSaveService {
    @Autowired
    noveldetailsMapper noveldetailsMapper;
    @Autowired
    novellistMapper novellistMapper;
    @Autowired 
    novellist book;
    /*
    1是成功 0返回失败
     */
@Override
   public int insertBook2(Integer nid,String nname,String nnkind,String author,Integer amount,String brief,Integer colamount,String covers){
      novellist temp=novellistMapper.selectByNName(nname);
      if(temp==null) {
         
          book.setNid(nid);
          book.setNname(nname);
          book.setNkind(nnkind);
          book.setAuthor(author);
          book.setAmount(amount);
          book.setBrief(brief);
          book.setColamount(colamount);
          book.setCovers(covers);
          novellistMapper.insert(book);
          return 1;
      }
   return 0;

}

    @Override
    @Transactional
   public int indexAndContentSave1(noveldetails noveldetails) {
    	noveldetails.setCid(noveldetails.getCid());
        noveldetails.setChapter(noveldetails.getChapter());
        noveldetails.setContent(noveldetails.getContent());
        noveldetailsMapper.insert(noveldetails);
        return 1;

    }

    @Override
    public int deleteByPrimaryKey(Integer nid) {
    noveldetailsMapper.deleteByPrimaryKey(nid);
    novellistMapper.deleteByPrimaryKey(nid);
        return 1;
    }

    @Override
    public int deleteByPrimaryContent(Integer nid, String chapter) {
    
        return  noveldetailsMapper.deleteByPrimaryKeyContent(nid,chapter);
    }


}
