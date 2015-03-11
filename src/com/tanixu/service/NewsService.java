package com.tanixu.service;

import java.util.List;

import com.tanixu.bean.News;

public interface NewsService {
	News findUserById(Integer id);
	List<News> findAll();
}
