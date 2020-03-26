package com.Dao;

import com.Model.noveldetails;
import com.Model.novellist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface noveldetailsMapper {

	List<noveldetails> getAllnovels();
	
	List<noveldetails> getChapters(Integer nid);

	List<noveldetails> getText(Integer nid,Integer cid);
	
	 int deleteByPrimaryKey(Integer nid);

	 int insert(noveldetails noveldetails);

	Integer update(Integer nid);

	int deleteByPrimaryKeyContent(Integer nid, String chapter);
	
	
}