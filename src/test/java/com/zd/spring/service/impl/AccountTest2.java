package com.zd.spring.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zd.spring.service.IAccountService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-transaction-test2.xml"})
public class AccountTest2 {
	
	@Autowired
	private IAccountService aService;
	
	@Test
	public void test1(){
		aService.transfer(1, 2, 500.0);
	}
}
