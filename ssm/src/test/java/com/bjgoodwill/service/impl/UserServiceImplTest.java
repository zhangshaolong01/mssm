package com.bjgoodwill.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjgoodwill.entity.User;
import com.bjgoodwill.service.IUserService;

import junit.framework.TestCase;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//spring配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
public class UserServiceImplTest extends TestCase {
	@Autowired
	public IUserService userService;
	
	@Test 
	public void getUserByIdTest(){
		User user = userService.getUserById(13);
		System.out.println(user.getUserName());
	}
}
