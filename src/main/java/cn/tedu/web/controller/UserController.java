package cn.tedu.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.common.util.MD5Util;
import cn.tedu.web.pojo.User;
import cn.tedu.web.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/login")
	public String login(String userName,String userPassword,HttpServletRequest req) throws Exception{
		
		//表单验证
		
		//将密码进行MD5加密
		userPassword = MD5Util.md5(userPassword);
		//调用服务层
		User user = userService.login(userName, userPassword);
		if(user != null){
			req.getSession().setAttribute("user", user);
		}
		return "redirect:/manage";
		
	}
}
