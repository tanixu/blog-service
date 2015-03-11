package com.tanixu.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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
public class UserDaoImpl implements UserDao{

	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcInsert insert;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insert = new SimpleJdbcInsert(dataSource)
	        .withTableName("user_info")
	        .usingGeneratedKeyColumns("userid");
	}

	
	/* (non-Javadoc)
	 * @see com.tanixu.dao.UserDao#findUserByUserAcc(java.lang.String)
	 * ���id��ѯ�û�
	 */
	public User findUserById(int userid) {
		String sql = "select * from user_info where userid = " + userid;
		User user = (User)jdbcTemplate.queryForObject(sql, new RowMapper<User>(){
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User user=new User();  
	            user.setUserid(rs.getInt("userid"));  
	            user.setUsername(rs.getString("username"));
	            user.setUseracc(rs.getString("useracc"));
				return user;
			}  	  
              
        });
		
		//User user = this.jdbcTemplate.queryForObject(sql,User.class,useracc);
		System.out.println(user.getUsername());
		return user;
	}
	
	/* (non-Javadoc)
	 * @see com.tanixu.dao.UserDao#add(com.tanixu.bean.User)
	 * ����û�
	 */
	public void add(User user){
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(user);
		Number newId = insert.executeAndReturnKey(parameters);
		user.setUserid(newId.intValue());
	}

	
	/* (non-Javadoc)
	 * @see com.tanixu.dao.UserDao#findUserByUseracc(java.lang.String)
	 * ����û��ʺŲ�ѯ
	 */
	public User findUserByUseracc(String useracc) {
		String sql = "select * from user_info where useracc = ?";
		final User user = new User();
		jdbcTemplate.query(sql,new Object[]{useracc},new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				user.setUserid(rs.getInt("userid"));  
	            user.setUsername(rs.getString("username"));
	            user.setUseracc(rs.getString("useracc"));
	            user.setUserpass(rs.getString("userpass"));
			}
		});
		return user;
	}

}
