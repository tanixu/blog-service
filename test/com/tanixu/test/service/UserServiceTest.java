package com.tanixu.test.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanixu.bean.User;
import com.tanixu.service.TypeService;
import com.tanixu.service.UserService;
import com.tanixu.service.impl.TypeServiceBean;
import com.tanixu.service.impl.UserServiceBean;


public class UserServiceTest {

private static UserService userService;
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		userService = (UserService)ctx.getBean(UserServiceBean.class);
	}
	
	@Test
	public void testFindById(){
		User user = userService.findById(1);
		System.out.println(user.getName());
	}
}
