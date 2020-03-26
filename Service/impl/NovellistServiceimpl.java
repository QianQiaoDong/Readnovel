package com.Service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.bookcaseMapper;
import com.Dao.novellistMapper;
import com.Model.novellist;
import com.Service.NovellistsService;
@Service
public class NovellistServiceimpl implements NovellistsService {

	@Autowired
	novellistMapper novellistmapper;
	@Override
	public List<novellist> Selectnovellist() {

		List<novellist>list=novellistmapper.Novellists();
		return list;
	}
	@Override
	public List<novellist> SelectnovellistByXuanHuan() {

		List<novellist>list=novellistmapper.selectNovellistByXuanHuan();
		return list;
	}	@Override
	public List<novellist> SelectnovellistByXuanYi() {

		List<novellist>list=novellistmapper.selectNovellistByXuanYi();
		return list;
	}
	@Override
	public List<novellist> SelectnovellistByDuShi() {

		List<novellist>list=novellistmapper.selectNovellistByDuShi();
		return list;
	}
	@Override
	public List<novellist> SelectnovellistByAiQing() {

		List<novellist>list=novellistmapper.selectNovellistByAiQing();
		return list;
	}
	@Override
	public List<novellist> SelectnovellistByKeHuan() {

		List<novellist>list=novellistmapper.selectNovellistByKeHuan();
		return list;
	}
	@Override
	public List<novellist> SelectnovellistByLiShi() {

		List<novellist>list=novellistmapper.selectNovellistByLiShi();
		return list;
	}
	@Override
	public novellist GetNovel(Integer nid) {
		novellist novel=novellistmapper.selectByPrimaryKey( nid);
		return novel;
	}

}
