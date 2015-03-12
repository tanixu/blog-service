package com.tanixu.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tanixu.bean.Article;
import com.tanixu.dao.ArticleDao;

@Repository
public class ArticleDaoImpl extends BaseDao implements ArticleDao {

	public Article findById(Integer id) {
		String sql = "select * from article where articleId = " + id;
		Article article = new Article();
		try {
			article = (Article)jdbcTemplate.queryForObject(sql, new RowMapper<Article>(){
				public Article mapRow(ResultSet rs, int row) throws SQLException {
					Article article=new Article();
					System.out.println(rs.wasNull());
					article.setArticleId(rs.getInt("articleId"));
					article.setArticleTitle(rs.getString("articleTitle"));
					article.setArticleAuthor(rs.getString("articleAuthor"));
					article.setArticleTime(rs.getDate("articleTime"));
					article.setArticleType(rs.getString("articleType"));
					article.setArticleContent(rs.getString("articleContent"));
					return article;
				}  	  
			      
			});
			
		} catch (Exception e) {
			return article;
		}
		return article;
	}

	public List<Article> findAll() {
		return null;
	}

}
