package com.zd.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zd.spring.dao.IAccountDao;

@Repository
public class AccountDaoImpl implements IAccountDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void inMoney(Integer id, Double money) {
		
		String sql = "update ar_account set money=money+? where id=?";
		jdbcTemplate.update(sql , money,id);
	}

	@Override
	public void deMoney(Integer id, Double money) {
		
		String sql = "update ar_account set money=money-? where id=?";
		jdbcTemplate.update(sql , money,id);
	}

}
