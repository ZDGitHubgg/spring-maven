package com.zd.spring.service;

public interface IAccountService {
	
	//转账
	void transfer(Integer out,Integer in,Double money);
}
