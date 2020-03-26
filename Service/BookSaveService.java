package com.Service;
import com.Model.*;

public interface BookSaveService {
    int insertBook2(Integer nid,String nname,String nnkind,String author,Integer amount,String brief,Integer colamount,String covers);

    /**
     * 保存章节
     */
    int indexAndContentSave1(noveldetails noveldetails);

    /*
    删除小说
     */
    int deleteByPrimaryKey(Integer nid);
    /*
    删除章节
     */
    int deleteByPrimaryContent(Integer nid,String chapter);
}