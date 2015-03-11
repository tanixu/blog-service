package com.tanixu.dao;

import java.util.List;

import com.tanixu.bean.News;

public interface NewsDao {
	News findById(Integer id);
	List<News> findAll();
}
