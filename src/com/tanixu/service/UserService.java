package com.tanixu.service;

import com.tanixu.bean.User;

public interface UserService{
	User findById(Integer id);
	User findByAccount(String account);
	Integer add(User user);
}
