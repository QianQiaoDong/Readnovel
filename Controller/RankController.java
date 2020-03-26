package com.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.Model.noveldetails;
import com.Model.novellist;
import com.Model.user;
import com.Service.impl.BookSaveServiceimpl;
import com.Service.impl.Novellistsimpl;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("/Rank")
public class RankController {

	@Autowired
	Novellistsimpl novellistimpl;
	
	@GetMapping("/user")
	public String Rank(user user) {
		
		return "ranks";
		
	}

	@GetMapping("/ranks")
	public String AllNovel(Model model)
	{ 
		 List<novellist> list=novellistimpl.Novellists();
		 model.addAttribute("list",list);
		return "ranks";
	}
}


