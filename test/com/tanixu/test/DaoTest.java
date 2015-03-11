package com.tanixu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanixu.bean.User;
import com.tanixu.dao.UserDao;
import com.tanixu.dao.impl.UserDaoImpl;

public class DaoTest {

	@Test
	public void test() { 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		UserDao userDao = (UserDaoImpl)ctx.getBean(UserDaoImpl.class);
		userDao.findUserByUseracc("xu627676436");

	}
	@Test
	public void testFindById() { 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		UserDao userDao = (UserDaoImpl)ctx.getBean(UserDaoImpl.class);
		userDao.findUserById(1);

	}
	
	@Test
	public void testAddMethod(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		UserDao userDao = (UserDaoImpl)ctx.getBean(UserDaoImpl.class);
		User user = new User();
		user.setUseracc("xty001");
		user.setUserpass("xu121121");
		user.setUsername("Œ“ «–ÏÃÏ‚¯");
		userDao.add(user);
	}

}
