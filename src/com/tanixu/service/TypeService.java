package com.tanixu.service;

import java.util.List;

import com.tanixu.bean.Type;

public interface TypeService {
	Type findById(Integer id);
	List<Type> findAll();
	List<Type> findGradeOne();
	List<Type> findByParentId(Integer parentId);
	Integer update(Type type);
	Integer deleteById(Integer id);
	Integer add(Type type);
}
