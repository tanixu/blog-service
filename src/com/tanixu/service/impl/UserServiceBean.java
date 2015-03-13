package com.tanixu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanixu.bean.User;
import com.tanixu.dao.UserDao;
import com.tanixu.service.UserService;

@Service
public class UserServiceBean implements UserService{
	
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao(){
		return userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User findById(Integer id) {
		return userDao.findById(id);
	}

	public User findByAccount(String account) {
		return userDao.findByAccount(account);
	}

	public Integer add(User user) {
		return userDao.add(user);
	}	

}
