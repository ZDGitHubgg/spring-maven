package com.zd.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zd.spring.dao.IAccountDao;
import com.zd.spring.service.IAccountService;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	private IAccountDao adao;
	
	@Transactional
	@Override
	public void transfer(Integer out, Integer in, Double money) {
		adao.deMoney(out, money);
		int i = 10/0;
		adao.inMoney(in, money);

	}

}
