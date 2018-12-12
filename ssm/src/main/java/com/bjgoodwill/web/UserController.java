package com.bjgoodwill.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.bjgoodwill.entity.User;
import com.bjgoodwill.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping(value="/showUserName",produces="text/html;charset=UTF-8")
	public String showUserName(int uid){
		User user = userService.getUserById(uid);
		
		JSONObject result = new JSONObject();
		result.put("user", user);
		System.out.println(result.toJSONString());
		
		return result.toJSONString();
	}
}
