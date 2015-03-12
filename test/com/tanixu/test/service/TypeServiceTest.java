package com.tanixu.test.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanixu.bean.Type;
import com.tanixu.service.TypeService;
import com.tanixu.service.impl.TypeServiceBean;

public class TypeServiceTest {
	
	private static TypeService typeService;
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		typeService = (TypeService)ctx.getBean(TypeServiceBean.class);
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:41:06 
	 * 备注：  测试查询所有类型
	 */
	@Test
	public void testFindAll(){
		List<Type> typeList = typeService.findAll();
		for (Type type : typeList) {
			System.out.println(type.getName());
		}
	}
	
	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:41:04 
	 * 备注：  测试根据id查询类型
	 */
	@Test
	public void testFindById(){
		Type type =typeService.findById(1);
		System.out.println(type.getCreateTime());
	}
	
	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:42:49 
	 * 备注：  测试根据id删除类型
	 */
	@Test
	public void testDeleteByid(){
		Integer count = typeService.deleteById(6);
		System.out.println(count);
	}
	
	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午5:08:44 
	 * 备注：  
	 */
	@Test
	public void testAdd(){
		Type type = new Type();
		type.setName("abv");
		type.setCreateTime(new Timestamp(new Date().getTime()));
		type.setParentId(1);
		typeService.add(type);
	}
}
