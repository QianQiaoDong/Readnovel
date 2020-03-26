package com.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Model.novellist;
@Mapper
public interface novellistMapper {

	 int deleteByPrimaryKey(Integer nid);

	    int insert(novellist record);

	    int insertSelective(novellist record);

	    novellist selectByPrimaryKey(Integer nid);

	    int updateByPrimaryKeySelective(novellist record);

	    int updateByPrimaryKey(novellist record);
	    
	List<novellist>Novellists();
	
	 novellist selectBySearch(String info);
     novellist selectByNName(String name);
	  
	Integer Amount(Integer nid);

	public List<novellist>selectNovellistByXuanHuan();
	public List<novellist>selectNovellistByXuanYi();
	public List<novellist>selectNovellistByDuShi();
	public List<novellist>selectNovellistByAiQing();
	public List<novellist>selectNovellistByKeHuan();
	public List<novellist>selectNovellistByLiShi();


}