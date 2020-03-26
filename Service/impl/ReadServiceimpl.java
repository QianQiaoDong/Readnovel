package com.Service.impl;

import com.Dao.noveldetailsMapper;
import com.Dao.novellistMapper;
import com.Model.noveldetails;
import com.Model.novellist;
import com.Service.ReadService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReadServiceimpl implements ReadService {

	@Autowired
	noveldetailsMapper noveldetailsmapper;
	
	@Autowired
	novellistMapper novellistmapper;

	@Override
	public List<noveldetails> getAllnovels() {
		List<noveldetails> list=noveldetailsmapper.getAllnovels();
		return list;
		
	}
	@Override
	public List<noveldetails> getChapters(Integer nid)
	{
		List<noveldetails> list=noveldetailsmapper.getChapters(nid);
		return list;
		
		
	}
    @Override
	public List<noveldetails> getText(Integer nid,Integer cid) {
		
		List<noveldetails> list=noveldetailsmapper.getText(nid,cid);
		return list;
	}

	@Override
	public Integer Amount(Integer nid) {
		
	Integer a=novellistmapper.Amount(nid);
		return null;
	}

	

	
}
