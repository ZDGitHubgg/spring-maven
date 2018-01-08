package com.zd.spring.jdbc;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Jdbc_test {
	@Test
	public void test() throws Exception{
		//1.创建c3p0链接池
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day20");
        dataSource.setUser("root");
        dataSource.setPassword("123");
        
        //创建JDBC模板
        JdbcTemplate template = new JdbcTemplate(dataSource);
        int i = template.update("insert into role values(?,?,?)", 4,"guest","游客");
        if (i!=0) {
			System.out.println("添加成功！");
		}
        
     
	}
	
    @Test
	public void test2() throws Exception{
		//1.创建c3p0链接池
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day20");
        dataSource.setUser("root");
        dataSource.setPassword("123");
        
        //创建JDBC模板
        JdbcTemplate template = new JdbcTemplate(dataSource);
        int j = template.update("delete from role where rid = ?", 4);
        if(j!=0){
        	System.out.println("删除成功！");
        }
        
     
	}
}
