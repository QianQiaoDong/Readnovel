package com.Service;

import java.util.List;

import javax.websocket.Decoder.Text;

import org.springframework.stereotype.Service;

import com.Model.noveldetails;

@Service
public interface ReadService {

	List<noveldetails> getAllnovels();
	
	List<noveldetails> getChapters(Integer nid);
	
	Integer Amount(Integer nid);

	List<noveldetails> getText(Integer nid, Integer cid);
}
