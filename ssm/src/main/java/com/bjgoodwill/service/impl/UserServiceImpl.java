package com.bjgoodwill.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjgoodwill.dao.IUserDao;
import com.bjgoodwill.entity.User;
import com.bjgoodwill.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	public IUserDao udao;

	@Override
	public User getUserById(int id) {
		return udao.selectByPrimaryKey(id);
	}

}
