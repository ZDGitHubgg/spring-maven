package com.zd.spring.dao.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zd.spring.dao.IRoleDao;
import com.zd.spring.pojo.po.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc-test.xml")
public class RoleDaoImplTest {

	@Autowired
	private IRoleDao roleDao;

	// 添加
	@Test
	public void test1() {
		Role role = new Role();
		role.setRname("zd");
		role.setAlias("张东");
		roleDao.save(role);
	}

	// 删除
	@Test
	public void test2() {
		roleDao.delete(5);
	}

	// 修改
	public void test3() {
		Role role = new Role();
		role.setRname("zd");
		role.setAlias("张东");
		role.setRid(3);
		roleDao.update(role);
	}

	// 通过id查询
	@Test
	public void test4() {
		Role byId = roleDao.getById(6);
		System.out.println(byId);
	}

	// 查询数据个数
	@Test
	public void test5() {
		int count = roleDao.getTocalCount();
		System.out.println(count);
	}

	// 查询所有
	@Test
	public void test6() {
		List<Role> list = roleDao.getAll();
		System.out.println(list);
	}
}
