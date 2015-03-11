package com.tanixu.dao;

import com.tanixu.bean.User;

public interface UserDao {
	
	User findUserById(int userid);
	
	User findUserByUseracc(String useracc);
	
	void add(User user);
	
}
