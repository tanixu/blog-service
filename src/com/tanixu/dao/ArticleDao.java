package com.tanixu.dao;

import java.util.List;

import com.tanixu.bean.Article;

public interface ArticleDao {
	Article findById(Integer id);
	List<Article> findAll();
}
