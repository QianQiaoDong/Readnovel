package com.Service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.novellistMapper;
import com.Model.novellist;
import com.Service.NovellistsService;
import com.Service.NovellistsService0;
@Service
public class Novellistsimpl implements NovellistsService0 {

	@Autowired
	novellistMapper novellistmapper;
	@Override
	public List<novellist> Novellists() {

		List<novellist>list=novellistmapper.Novellists();
		return list;
	}
	@Override
	public novellist getNovel(Integer nid) {
novellist novel=novellistmapper.selectByPrimaryKey(nid);
return novel;
	}
	@Override
	public Set<novellist> selectNovel(String info) {
		Set<novellist> set=null;
        set.add(novellistmapper.selectBySearch(info));
		return set;
	}
	}


