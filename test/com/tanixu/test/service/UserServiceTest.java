package com.tanixu.test.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanixu.bean.User;
import com.tanixu.service.UserService;
import com.tanixu.service.impl.UserServiceImpl;


public class UserServiceTest {

	@Test
	public void test(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		UserService userService = (UserServiceImpl)ctx.getBean(UserServiceImpl.class);
		User user = userService.findUserByUserAcc("xty001");
		System.out.println(user.getUsername());
	}
}
