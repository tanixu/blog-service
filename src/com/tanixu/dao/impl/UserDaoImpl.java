package com.tanixu.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tanixu.bean.User;
import com.tanixu.dao.UserDao;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao{

	/**
	 * @param rs
	 * @return
	 * @throws SQLException
	 * �������
	 */
	private User fillResult(ResultSet rs) throws SQLException{
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAccount(rs.getString("account"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	
	public User findById(Integer id) {
		String sql = "select * from user where id = " + id;
		return jdbcTemplate.queryForObject(sql, new RowMapper<User>(){
			public User mapRow(ResultSet rs, int row) throws SQLException {
				return fillResult(rs);
			}  	  
		      
		});
	}

	public User findByAccount(String account) {
		String sql = "select * from user where account = " + account;
		return jdbcTemplate.queryForObject(sql, new RowMapper<User>(){
			public User mapRow(ResultSet rs, int row) throws SQLException {
				return fillResult(rs);
			}  	  
		      
		});
	}

	public Integer add(User user) {
		String sql = "insert into user(id,name,account,password) values(?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[]{
				user.getId(),user.getName(),user.getAccount(),user.getPassword()
		});
	}


}
