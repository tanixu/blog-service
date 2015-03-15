package com.tanixu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanixu.bean.Type;
import com.tanixu.dao.TypeDao;
import com.tanixu.service.TypeService;

@Service
public class TypeServiceBean implements TypeService {
	
	@Autowired
	private TypeDao typeDao;
	

	public TypeDao getTypeDao() {
		return typeDao;
	}

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:40:22 
	 * 备注：   
	 * @see com.tanixu.service.TypeService#findById(java.lang.Integer)
	 */
	public Type findById(Integer id) {
		return typeDao.findById(id);
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:40:26 
	 * 备注：   
	 * @see com.tanixu.service.TypeService#findAll()
	 */
	public List<Type> findAll() {
		return typeDao.findAll();
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:40:28 
	 * 备注：   
	 * @see com.tanixu.service.TypeService#update(com.tanixu.bean.Type)
	 */
	public Integer update(Type type) {
		return null;
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:40:31 
	 * 备注：   
	 * @see com.tanixu.service.TypeService#deleteById(java.lang.Integer)
	 */
	public Integer deleteById(Integer id) {
		return typeDao.deleteById(id);
	}

	/* 创建人：徐天怿   
	 * 创建时间：2015-3-12 下午4:54:30 
	 * 备注：   添加类型
	 * @see com.tanixu.service.TypeService#add(com.tanixu.bean.Type)
	 */
	public Integer add(Type type) {
		return typeDao.add(type);
	}

	public List<Type> findGradeOne() {
		return typeDao.findByParentId(0);
	}

	public List<Type> findByParentId(Integer parentId) {
		return typeDao.findByParentId(parentId);
	}

}
