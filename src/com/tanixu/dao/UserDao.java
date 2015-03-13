package com.tanixu.dao;

import com.tanixu.bean.User;

public interface UserDao {
	User findById(Integer id);
	User findByAccount(String account);
	Integer add(User user);
	
}
