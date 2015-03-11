package com.tanixu.test.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanixu.controller.UserController;


public class UserControllerTest {

	
	@Test
	public void test(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		UserController controller = (UserController)ctx.getBean(UserController.class);
		System.out.println(controller.getClass().getMethods()[2]);
	}
}
