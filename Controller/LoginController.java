package com.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Model.user;
import com.Service.impl.LoginServiceimpl;

@Controller
@RequestMapping("/Login")
//@SessionAttributes("user")
public class LoginController {

	@Autowired
	LoginServiceimpl loginServiceimpl;
	
	@GetMapping("/user")
	public String Login(user user) {
		
		return "login1";
		
	}

	
	
	@GetMapping("/mainpage")
	public String Swift()
	{
		return "index";
	}

	@ResponseBody
	@PostMapping("/user")
	public user Login1(@RequestBody user user,HttpServletRequest request)
	{
		
		System.out.println(user.getUid());
		System.out.println(user.getPwd());
		System.err.println(user.getIdentity());
		HttpSession session=request.getSession();
		if (user!=null) {
			session.setAttribute("uid",user.getUid());
			session.setAttribute("pwd",user.getPwd());
		}
		
		System.out.println(session.getId());
		user user2=loginServiceimpl.SelectUser(user.getUid(), user.getPwd(),user.getIdentity());
		System.out.println(session.getAttribute("uid"));
		System.out.println(user2.getUid());
		return user2;
	}
	}

