package com.Service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.Model.novellist;

@Service
public interface NovellistsService0 {
	List<novellist> Novellists();

	novellist getNovel(Integer nid);
	Set<novellist>selectNovel(String info);
}
