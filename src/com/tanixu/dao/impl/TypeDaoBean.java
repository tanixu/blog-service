package com.tanixu.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tanixu.bean.Type;
import com.tanixu.dao.TypeDao;

@Repository
public class TypeDaoBean extends BaseDao implements TypeDao {
	
	private Type fillResult(ResultSet rs) throws SQLException{
		Type type = new Type();
		type.setId(rs.getInt("id"));
		type.setName(rs.getString("name"));
		type.setParentId(rs.getInt("parentId"));
		type.setCreateTime(rs.getTimestamp("createTime"));
		return type;
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:26:40 
	 * 备注：   根据id查询类型
	 * @see com.tanixu.dao.TypeDao#findById(java.lang.Integer)
	 */
	public Type findById(Integer id) {
		String sql = "select * from type where id = " + id;
		return jdbcTemplate.queryForObject(sql, new RowMapper<Type>(){
			public Type mapRow(ResultSet rs, int row) throws SQLException {
				return fillResult(rs);
			}  	  
		      
		});
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:22:57 
	 * 备注：查询所有的类型
	 * @see com.tanixu.dao.TypeDao#findAll()
	 */
	public List<Type> findAll() {
		String sql = "select * from type";
		return jdbcTemplate.query(sql, new RowMapper<Type>(){
			public Type mapRow(ResultSet rs, int row) throws SQLException {
				return fillResult(rs);
			}});
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:28:07 
	 * 备注：   根据id更新类型
	 * @see com.tanixu.dao.TypeDao#updateById(java.lang.Integer)
	 */
	public Integer update(Type type) {
//		String sql = "update t_user set username=? where user_id=?";
//		return jdbcTemplate.update(sql,id);
		return null;
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:28:23 
	 * 备注：   根据id删除类型
	 * @see com.tanixu.dao.TypeDao#deleteById(java.lang.Integer)
	 */
	public Integer deleteById(Integer id) {
		String sql = "delete from type where id=?";
		return jdbcTemplate.update(sql,id);
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:45:44 
	 * 备注：   添加类型
	 * @see com.tanixu.dao.TypeDao#add(com.tanixu.bean.Type)
	 */
	public Integer add(Type type) {
		String sql = "insert into type(id,name,parentId,createTime) values(?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[]{
				type.getId(),type.getName(),type.getParentId(),type.getCreateTime()
		});
	}

}
