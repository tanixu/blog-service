package com.tanixu.dao;

import java.util.List;

import com.tanixu.bean.Type;

public interface TypeDao {
	Type findById(Integer id);
	List<Type> findAll();
	List<Type> findByParentId(Integer parentId);
	Integer update(Type type);
	Integer deleteById(Integer id);
	Integer add(Type type);
}
