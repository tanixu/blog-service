package com.tanixu.service;

import java.util.List;

import com.tanixu.bean.Article;

public interface ArticleService {
	Article findUserById(Integer id);
	List<Article> findAll();
}
