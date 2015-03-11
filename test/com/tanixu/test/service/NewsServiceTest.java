package com.tanixu.test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanixu.bean.News;
import com.tanixu.service.NewsService;
import com.tanixu.service.impl.NewsServiceImpl;

public class NewsServiceTest {

	@Test
	public void testFindById(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		NewsService newsService = (NewsService)ctx.getBean(NewsServiceImpl.class);
		News news = newsService.findUserById(1);
		System.out.println(news.getNewsContent());
	}
	
	@Test
	public void testFindAll(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		NewsService newsService = (NewsService)ctx.getBean(NewsServiceImpl.class);
		List<News> newsList = newsService.findAll();
		for (News news : newsList) {
			System.out.println(news.getNewsAuthor());
		}
	}
}
