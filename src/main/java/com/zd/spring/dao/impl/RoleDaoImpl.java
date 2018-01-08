package com.zd.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.zd.spring.dao.IRoleDao;
import com.zd.spring.pojo.po.Role;

public class RoleDaoImpl extends JdbcDaoSupport implements IRoleDao {

	@Override
	// 添加
	public void save(Role role) {
		String sql = "insert into role(rname,alias) value(?,?)";
		getJdbcTemplate().update(sql, role.getRname(), role.getAlias());
	}

	// 删除
	@Override
	public void delete(Integer id) {
		String sql = "delete from role where rid = ?";
		getJdbcTemplate().update(sql, id);

	}

	// 修改
	@Override
	public void update(Role role) {
		String sql = "update role set rname=?,alias=? where rid = ?";
		getJdbcTemplate().update(sql, role.getRname(), role.getAlias(), role.getRid());

	}

	// 通过id查询
	@Override
	public Role getById(Integer id) {
		String sql = "select * from role where rid = ?";
		Role role = (Role) getJdbcTemplate().queryForObject(sql, new Object[]{id}, new RowMapper<Object>() {

            public Object mapRow(ResultSet resultSet, int index) throws SQLException {
                //将一行数据解析成一个java对象

                return  mapRowHandler(resultSet);
            }
        });

        return role;
	}
	
	
	//查询数据个数
	@Override
	public int getTocalCount() {
		String sql = "select count(*) from role";
		Integer count = getJdbcTemplate().queryForObject(sql , Integer.class);
		return count;
	}
	
	
	//查询所有
	@Override
	public List<Role> getAll() {
		String sql = "select * from role";
		List<Role> list = getJdbcTemplate().query(sql , new RowMapper<Role>(){
			public Role mapRow(ResultSet resultSet, int index) throws SQLException {
                //将一行数据解析成一个java对象
                return  mapRowHandler(resultSet);
            }
		});
		return list;
	}

	private Role mapRowHandler(ResultSet resultSet) throws SQLException {
		Role role = new Role();
		role.setRid(resultSet.getInt("rid"));
		role.setRname(resultSet.getString("rname"));
		role.setAlias(resultSet.getString("alias"));
		return role;
	}

}
