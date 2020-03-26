package com.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Model.novellist;
@Service
public interface NovellistsService {
	public List<novellist>Selectnovellist( );
	public List<novellist>SelectnovellistByXuanHuan( );
	public List<novellist>SelectnovellistByXuanYi( );
	public List<novellist>SelectnovellistByDuShi( );
	public List<novellist>SelectnovellistByAiQing( );
	public List<novellist>SelectnovellistByKeHuan( );
	public List<novellist>SelectnovellistByLiShi( );
	public novellist GetNovel(Integer nid);
}
