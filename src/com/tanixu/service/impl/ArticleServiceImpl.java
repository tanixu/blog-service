package com.tanixu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanixu.bean.Article;
import com.tanixu.dao.ArticleDao;
import com.tanixu.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	public ArticleDao getArticleDao() {
		return articleDao;
	}
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	public Article findUserById(Integer id) {
		return articleDao.findById(id);
	}
	public List<Article> findAll() {
		return articleDao.findAll();
	}

}
