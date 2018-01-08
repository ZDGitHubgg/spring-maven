package com.zd.spring.dao;

import java.util.List;

import com.zd.spring.pojo.po.Role;

public interface IRoleDao {
	//增
	void save(Role role);
	
	//删
	void delete(Integer id);
	
	//改
	void update(Role role);
	
	//查
	Role getById(Integer id); 
	
	int getTocalCount();
	
	List<Role> getAll();
}
