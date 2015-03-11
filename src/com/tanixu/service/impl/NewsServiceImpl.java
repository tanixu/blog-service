package com.tanixu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanixu.bean.News;
import com.tanixu.dao.NewsDao;
import com.tanixu.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDao newsDao;
	public NewsDao getNewsDao() {
		return newsDao;
	}
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public News findUserById(Integer id) {
		return newsDao.findById(id);
	}
	public List<News> findAll() {
		return newsDao.findAll();
	}

}
