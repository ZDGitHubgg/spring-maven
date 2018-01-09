package com.zd.spring.dao;

public interface IAccountDao {
	
	//加钱
	void inMoney(Integer id,Double money);
	
	//减钱
	void deMoney(Integer id,Double money);
}
