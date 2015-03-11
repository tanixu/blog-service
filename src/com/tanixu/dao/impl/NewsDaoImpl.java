package com.tanixu.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tanixu.bean.News;
import com.tanixu.dao.NewsDao;

@Repository
public class NewsDaoImpl extends BaseDao implements NewsDao{

	public News findById(Integer id) {
		String sql = "select * from news where newsId = " + id;
		News news = (News)jdbcTemplate.queryForObject(sql, new RowMapper<News>(){
			public News mapRow(ResultSet rs, int row) throws SQLException {
				News news=new News();
				news.setNewsId(rs.getInt("newsId"));
				news.setNewsTitle(rs.getString("newsTitle"));
				news.setNewsAuthor(rs.getString("newsAuthor"));
				news.setNewsTime(rs.getDate("newsTime"));
				news.setNewsType(rs.getString("newsType"));
				news.setNewsContent(rs.getString("newsContent"));
				return news;
			}  	  
              
        });
		return news;
	}

	public List<News> findAll() {
		String sql = "select * from news";
		List<News> newsList = jdbcTemplate.queryForList(sql, News.class);
		return newsList;
	}

}
