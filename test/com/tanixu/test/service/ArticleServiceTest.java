package com.tanixu.test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanixu.bean.Article;
import com.tanixu.bean.News;
import com.tanixu.service.ArticleService;
import com.tanixu.service.NewsService;
import com.tanixu.service.impl.ArticleServiceImpl;
import com.tanixu.service.impl.NewsServiceImpl;

public class ArticleServiceTest {

	@Test
	public void testFindById(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		ArticleService articleService = (ArticleService)ctx.getBean(ArticleServiceImpl.class);
		Article article = articleService.findUserById(3);
		System.out.println(article.getArticleContent());
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
